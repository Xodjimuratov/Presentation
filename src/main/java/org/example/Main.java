package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        TelegramBotsApi api = null;
        try {
            api = new TelegramBotsApi(DefaultBotSession.class);
            api.registerBot(new MyBot("6930310259:AAGrwUADt1YxJxUrarQvfFBbOmylEfhuoUA"));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}