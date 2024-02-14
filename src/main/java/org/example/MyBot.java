package org.example;

import org.example.modul.BotState;
import org.example.modul.Language;
import org.example.modul.User;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    private UserService userService = new UserServiceImpl();
    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String text = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            if (text.equals("/start")){
                if (userService.get(chatId) == null){
                    User user = new User();
                    user.setState(BotState.LANG);
                    user.setChatId(chatId);
                    userService.create(user);
                }

            } else {
                User user = userService.get(chatId);
                if (user.getLang() == Language.UZ) {
                    switch (user.getState()) {
                        case LANG -> {
                            if (text.equals("O'zbek tili")) {

                            } else if (text.equals("Rus tili")) {

                            }
                        }
                        case MAIN -> {

                        }
                    }
                } else if (user.getLang() == Language.RU) {

                }
            }
        } else if (update.hasCallbackQuery()){

        }
    }

    @Override
    public String getBotUsername() {
        return "pdp_senior_group_bot";
    }
}
