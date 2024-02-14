package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatId = update.getMessage().getChatId();
        if (update.getMessage().getText().equals("/start")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardButton uz = new KeyboardButton();
            uz.setText("\uD83C\uDDFA\uD83C\uDDFFUzbek tili");
            KeyboardButton ru = new KeyboardButton();
            ru.setText("\uD83C\uDDF7\uD83C\uDDFARus tili");

            row1.add(uz);
            row2.add(ru);

            rowList.add(row1);
            rowList.add(row2);
            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83C\uDDFA\uD83C\uDDFFTilni tanlang    " +
                    "   \uD83C\uDDF7\uD83C\uDDFAПожалуйста, выберите язык");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFUzbek tili")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardButton Sotish = new KeyboardButton();
            Sotish.setText("Sotish\uD83D\uDCB0");
            KeyboardButton Sotib = new KeyboardButton();
            Sotib.setText("Sotib olish\uD83D\uDCB3");
            KeyboardButton Sozlamalar = new KeyboardButton();
            Sozlamalar.setText("Sozlamalar⚙️\uFE0F");
            KeyboardButton Aloqa = new KeyboardButton();
            Aloqa.setText("Aloqa\uD83D\uDCDE");

            row1.add(Sotish);
            row2.add(Sotib);
            row3.add(Sozlamalar);
            row4.add(Aloqa);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Kia Uzbekistanga xush kelibsiz");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("\uD83C\uDDF7\uD83C\uDDFAРусский язык")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardButton заявка = new KeyboardButton();
            KeyboardButton Продажа = new KeyboardButton();
            Продажа.setText("Продажа\uD83D\uDCB0");
            KeyboardButton Покупка = new KeyboardButton();
            Покупка.setText("Покупка\uD83D\uDCB3");
            KeyboardButton Настройки = new KeyboardButton();
            Настройки.setText("Настройки⚙️\uFE0F");
            KeyboardButton Коммуникация = new KeyboardButton();
            Коммуникация.setText("Коммуникация\uD83D\uDCDE");

            row1.add(Продажа);
            row2.add(Покупка);
            row3.add(Настройки);
            row4.add(Коммуникация);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Добро пожаловать в Киа Узбекистан");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Sotish\uD83D\uDCB0")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Kia Sergeli");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Kia Yakkasaroy");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Sergeli);
            row1.add(Yakkasaroy);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Shartnoma tuzmoqchi bo'lgan joyni tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Продажа\uD83D\uDCB0")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Сергели = new KeyboardButton();
            Сергели.setText("Киа Сергели");
            KeyboardButton Яккасарой = new KeyboardButton();
            Яккасарой.setText("Киа Яккасарой");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(Сергели);
            row1.add(Яккасарой);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Выберите место, где хотите заключить договор");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Sotib olish\uD83D\uDCB3")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Kia Sergeli");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Kia Yakkasaroy");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Sergeli);
            row1.add(Yakkasaroy);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDE80 Test drayvga ro'yxatdan o'tish");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("Покупка\uD83D\uDCB3")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Сергели = new KeyboardButton();
            Сергели.setText("Киа Сергели");
            KeyboardButton Яккасарой = new KeyboardButton();
            Яккасарой.setText("Киа Яккасарой");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(Сергели);
            row1.add(Яккасарой);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDE80 Запись на тест драйв");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Sozlamalar⚙️\uFE0F")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Kia Sergeli");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Kia Yakkasaroy");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Sergeli);
            row1.add(Yakkasaroy);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Avtomobilni tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Настройки⚙️\uFE0F")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Сергели = new KeyboardButton();
            Сергели.setText("Киа Сергели");
            KeyboardButton Яккасарой = new KeyboardButton();
            Яккасарой.setText("Киа Яккасарой");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(Сергели);
            row1.add(Яккасарой);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("⚠️\uFE0F Запись на ТО");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("Aloqa\uD83D\uDCDE")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardRow row7 = new KeyboardRow();
            KeyboardButton Cerato = new KeyboardButton();
            Cerato.setText("Cerato");
            KeyboardButton Carnival = new KeyboardButton();
            Carnival.setText("Carnival");
            KeyboardButton K5 = new KeyboardButton();
            K5.setText("K5");
            KeyboardButton K8 = new KeyboardButton();
            K8.setText("K8");
            KeyboardButton K9 = new KeyboardButton();
            K9.setText("K9");
            KeyboardButton EV6 = new KeyboardButton();
            EV6.setText("EV6");
            KeyboardButton EV9 = new KeyboardButton();
            EV9.setText("EV9");
            KeyboardButton Stinger = new KeyboardButton();
            Stinger.setText("Stinger");
            KeyboardButton Seltos = new KeyboardButton();
            Seltos.setText("Seltos");
            KeyboardButton Sportage = new KeyboardButton();
            Sportage.setText("Sportage");
            KeyboardButton Bongo = new KeyboardButton();
            Bongo.setText("Bongo");
            KeyboardButton Menu = new KeyboardButton();
            Menu.setText("\uD83C\uDFE1 Asosiy menyu");
            KeyboardButton Orqaga = new KeyboardButton();
            Orqaga.setText("◀️\uFE0F Orqaga");

            row1.add(Bongo);
            row2.add(Cerato);
            row2.add(Carnival);
            row3.add(K5);
            row3.add(K8);
            row4.add(K9);
            row4.add(EV6);
            row5.add(EV9);
            row5.add(Stinger);
            row6.add(Seltos);
            row6.add(Sportage);
            row7.add(Menu);
            row7.add(Orqaga);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);
            rowList.add(row7);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDE98Mashina madelini tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("Коммуникация\uD83D\uDCDE")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardRow row7 = new KeyboardRow();
            KeyboardButton Cerato = new KeyboardButton();
            Cerato.setText("Cerato");
            KeyboardButton Carnival = new KeyboardButton();
            Carnival.setText("Carnival");
            KeyboardButton K5 = new KeyboardButton();
            K5.setText("K5");
            KeyboardButton K8 = new KeyboardButton();
            K8.setText("K8");
            KeyboardButton K9 = new KeyboardButton();
            K9.setText("K9");
            KeyboardButton EV6 = new KeyboardButton();
            EV6.setText("EV6");
            KeyboardButton EV9 = new KeyboardButton();
            EV9.setText("EV9");
            KeyboardButton Stinger = new KeyboardButton();
            Stinger.setText("Stinger");
            KeyboardButton Seltos = new KeyboardButton();
            Seltos.setText("Seltos");
            KeyboardButton Sportage = new KeyboardButton();
            Sportage.setText("Sportage");
            KeyboardButton Bongo = new KeyboardButton();
            Bongo.setText("Bongo");
            KeyboardButton Menu = new KeyboardButton();
            Menu.setText("\uD83C\uDFE1 Asosiy menyu");
            KeyboardButton Orqaga = new KeyboardButton();
            Orqaga.setText("◀️\uFE0F Orqaga");

            row1.add(Bongo);
            row2.add(Cerato);
            row2.add(Carnival);
            row3.add(K5);
            row3.add(K8);
            row4.add(K9);
            row4.add(EV6);
            row5.add(EV9);
            row5.add(Stinger);
            row6.add(Seltos);
            row6.add(Sportage);
            row7.add(Menu);
            row7.add(Orqaga);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);
            rowList.add(row7);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDE98Mashina madelini tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83C\uDFE1 Asosiy menyu")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardButton Shartnoma = new KeyboardButton();
            Shartnoma.setText("\uD83D\uDCE1\uFE0F Shartnoma uchun onlayn ariza");
            KeyboardButton Test = new KeyboardButton();
            Test.setText("\uD83D\uDE80 Test drayvga ro'yxatdan o'tish");
            KeyboardButton Xizmat = new KeyboardButton();
            Xizmat.setText("⚠️\uFE0F Xizmat ko'rsatish uchun ro'yxatdan o'ting");
            KeyboardButton assortiment = new KeyboardButton();
            assortiment.setText("\uD83D\uDC47\uD83C\uDFFB Modellar assortimenti");
            KeyboardButton Narxlar = new KeyboardButton();
            Narxlar.setText("\uD83D\uDCB5 Narxlar ro'yxati");
            KeyboardButton Kompaniya = new KeyboardButton();
            Kompaniya.setText("\uD83C\uDFE2 Kompaniya haqida");
            KeyboardButton Kontakt = new KeyboardButton();
            Kontakt.setText("☎️\uFE0F Kontaktlar");
            KeyboardButton Qayta = new KeyboardButton();
            Qayta.setText("\uD83D\uDCDD Qayta aloqa");
            KeyboardButton til = new KeyboardButton();
            til.setText("\uD83C\uDDF7\uD83C\uDDFA \uD83D\uDD04 \uD83C\uDDFA\uD83C\uDDFF");


            row1.add(Shartnoma);
            row2.add(Test);
            row2.add(Xizmat);
            row3.add(assortiment);
            row3.add(Narxlar);
            row4.add(Kompaniya);
            row4.add(Kontakt);
            row5.add(Qayta);
            row6.add(til);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Kia Uzbekistanga xush kelibsiz");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83C\uDFE1 Главное меню")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardButton заявка = new KeyboardButton();
            заявка.setText("\uD83D\uDCE1\uFE0F Онлайн заявка на договор");
            KeyboardButton тест = new KeyboardButton();
            тест.setText("\uD83D\uDE80 Запись на тест драйв");
            KeyboardButton Запись = new KeyboardButton();
            Запись.setText("⚠️\uFE0F Запись на ТО");
            KeyboardButton ряд = new KeyboardButton();
            ряд.setText("\uD83D\uDC47\uD83C\uDFFB Модельный ряд");
            KeyboardButton Прайс = new KeyboardButton();
            Прайс.setText("\uD83D\uDCB5 Прайс-лист");
            KeyboardButton компании = new KeyboardButton();
            компании.setText("\uD83C\uDFE2 О компании");
            KeyboardButton Контакт = new KeyboardButton();
            Контакт.setText("☎️\uFE0F Контакты");
            KeyboardButton Обратная = new KeyboardButton();
            Обратная.setText("\uD83D\uDCDD Обратная связь");
            KeyboardButton til = new KeyboardButton();
            til.setText("\uD83C\uDDF7\uD83C\uDDFA \uD83D\uDD04 \uD83C\uDDFA\uD83C\uDDFF");

            row1.add(заявка);
            row2.add(тест);
            row2.add(Запись);
            row3.add(ряд);
            row3.add(Прайс);
            row4.add(компании);
            row4.add(Контакт);
            row5.add(Обратная);
            row6.add(til);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Добро пожаловать в Киа Узбекистан");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("\uD83D\uDCDD Обратная связь")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton звонок = new KeyboardButton();
            звонок.setText("\uD83D\uDCDE Обратный звонок");
            KeyboardButton Оставить = new KeyboardButton();
            Оставить.setText("\uD83D\uDCDD Оставить отзыв");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(звонок);
            row1.add(Оставить);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDCDD Обратная связь");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83D\uDCDD Qayta aloqa")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Qayta = new KeyboardButton();
            Qayta.setText("\uD83D\uDCDE Qayta qo'ng'iroq");
            KeyboardButton Fikr = new KeyboardButton();
            Fikr.setText("\uD83D\uDCDD Fikr qoldirish");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Qayta);
            row1.add(Fikr);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDCDD Qayta aloqa");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("◀️\uFE0F Orqaga")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Kia Sergeli");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Kia Yakkasaroy");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Sergeli);
            row1.add(Yakkasaroy);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDE98Mashina madelini tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83C\uDDF7\uD83C\uDDFA \uD83D\uDD04 \uD83C\uDDFA\uD83C\uDDFF")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardButton заявка = new KeyboardButton();
            заявка.setText("\uD83D\uDCE1\uFE0F Онлайн заявка на договор");
            KeyboardButton тест = new KeyboardButton();
            тест.setText("\uD83D\uDE80 Запись на тест драйв");
            KeyboardButton Запись = new KeyboardButton();
            Запись.setText("⚠️\uFE0F Запись на ТО");
            KeyboardButton ряд = new KeyboardButton();
            ряд.setText("\uD83D\uDC47\uD83C\uDFFB Модельный ряд");
            KeyboardButton Прайс = new KeyboardButton();
            Прайс.setText("\uD83D\uDCB5 Прайс-лист");
            KeyboardButton компании = new KeyboardButton();
            компании.setText("\uD83C\uDFE2 О компании");
            KeyboardButton Контакт = new KeyboardButton();
            Контакт.setText("☎️\uFE0F Контакты");
            KeyboardButton Обратная = new KeyboardButton();
            Обратная.setText("\uD83D\uDCDD Обратная связь");
            KeyboardButton til = new KeyboardButton();
            til.setText("\uD83C\uDDF7\uD83C\uDDFA \uD83D\uDD04 \uD83C\uDDFA\uD83C\uDDFF");

            row1.add(заявка);
            row2.add(тест);
            row2.add(Запись);
            row3.add(ряд);
            row3.add(Прайс);
            row4.add(компании);
            row4.add(Контакт);
            row5.add(Обратная);
            row6.add(til);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("Добро пожаловать в Киа Узбекистан");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("☎️\uFE0F Kontaktlar")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Dilerlar = new KeyboardButton();
            Dilerlar.setText("\uD83D\uDCCD\uFE0F Dilerlar");
            KeyboardButton aloqa = new KeyboardButton();
            aloqa.setText("\uD83D\uDC54 Kia Uzbekistan aloqa markazi");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Dilerlar);
            row1.add(aloqa);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("☎️\uFE0F Kontaktlar");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("☎️\uFE0F Контакты")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Дилеры = new KeyboardButton();
            Дилеры.setText("\uD83D\uDCCD\uFE0F Дилеры");
            KeyboardButton центр = new KeyboardButton();
            центр.setText("\uD83D\uDC54 Контакт-центр Киа Узбекистан");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(Дилеры);
            row1.add(центр);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("☎️\uFE0F Контакты");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83D\uDCCD\uFE0F Dilerlar")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardRow row7 = new KeyboardRow();
            KeyboardRow row8 = new KeyboardRow();
            KeyboardRow row9 = new KeyboardRow();
            KeyboardRow row10 = new KeyboardRow();
            KeyboardRow row11 = new KeyboardRow();
            KeyboardRow row12 = new KeyboardRow();
            KeyboardRow row13 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Kia Sergeli");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Kia Yakkasaroy");
            KeyboardButton Navoi = new KeyboardButton();
            Navoi.setText("Kia Navoi");
            KeyboardButton Urgench = new KeyboardButton();
            Urgench.setText("Kia Urgench");
            KeyboardButton Denov = new KeyboardButton();
            Denov.setText("Kia Denov");
            KeyboardButton Samarqand = new KeyboardButton();
            Samarqand.setText("Kia Samarqand");
            KeyboardButton Buxoro = new KeyboardButton();
            Buxoro.setText("Kia Buxoro");
            KeyboardButton Termiz = new KeyboardButton();
            Termiz.setText("Kia Termiz");
            KeyboardButton Kokand = new KeyboardButton();
            Kokand.setText("Kia Kokand");
            KeyboardButton Andijon = new KeyboardButton();
            Andijon.setText("Kia Andijan");
            KeyboardButton Qibray = new KeyboardButton();
            Qibray.setText("Kia Qibray");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");
            KeyboardButton Orqagaa = new KeyboardButton();
            Orqagaa.setText("◀️\uFE0F Orqagaa");

            row1.add(Sergeli);
            row2.add(Yakkasaroy);
            row3.add(Navoi);
            row4.add(Urgench);
            row5.add(Denov);
            row6.add(Samarqand);
            row7.add(Buxoro);
            row8.add(Termiz);
            row9.add(Kokand);
            row10.add(Andijon);
            row11.add(Qibray);
            row12.add(menyu);
            row13.add(Orqagaa);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);
            rowList.add(row7);
            rowList.add(row8);
            rowList.add(row9);
            rowList.add(row10);
            rowList.add(row11);
            rowList.add(row12);
            rowList.add(row13);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDCCD\uFE0F Dilerlarimiz");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83D\uDCCD\uFE0F Дилеры")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardRow row7 = new KeyboardRow();
            KeyboardRow row8 = new KeyboardRow();
            KeyboardRow row9 = new KeyboardRow();
            KeyboardRow row10 = new KeyboardRow();
            KeyboardRow row11 = new KeyboardRow();
            KeyboardButton Sergeli = new KeyboardButton();
            Sergeli.setText("Киа Сергели");
            KeyboardButton Yakkasaroy = new KeyboardButton();
            Yakkasaroy.setText("Киа Яккасарой");
            KeyboardButton Navoi = new KeyboardButton();
            Navoi.setText("Киа Навои");
            KeyboardButton Urgench = new KeyboardButton();
            Urgench.setText("Киа Ургенч");
            KeyboardButton Denov = new KeyboardButton();
            Denov.setText("Киа Денов");
            KeyboardButton Samarqand = new KeyboardButton();
            Samarqand.setText("Киа Самарканд");
            KeyboardButton Buxoro = new KeyboardButton();
            Buxoro.setText("Киа Бухара");
            KeyboardButton Termiz = new KeyboardButton();
            Termiz.setText("Киа Термиз");
            KeyboardButton Kokand = new KeyboardButton();
            Kokand.setText("Киа Коканд");
            KeyboardButton Andijan = new KeyboardButton();
            Andijan.setText("Киа Андижан");
            KeyboardButton Qibray = new KeyboardButton();
            Qibray.setText("Киа Кибрай");
            KeyboardButton jentra = new KeyboardButton();
            jentra.setText("\uD83C\uDFE1 Главное меню");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("◀️\uFE0F Назадд");


            row1.add(Sergeli);
            row2.add(Yakkasaroy);
            row3.add(Navoi);
            row4.add(Urgench);
            row5.add(Denov);
            row6.add(Samarqand);
            row7.add(Buxoro);
            row8.add(Termiz);
            row9.add(Kokand);
            row10.add(Andijan);
            row11.add(Qibray);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);
            rowList.add(row7);
            rowList.add(row8);
            rowList.add(row9);
            rowList.add(row10);
            rowList.add(row11);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83D\uDCCD\uFE0F Дилеры");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("◀️\uFE0F Orqagaa")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Dilerlar = new KeyboardButton();
            Dilerlar.setText("\uD83D\uDCCD\uFE0F Dilerlar");
            KeyboardButton aloqa = new KeyboardButton();
            aloqa.setText("\uD83D\uDC54 Kia Uzbekistan aloqa markazi");
            KeyboardButton menyu = new KeyboardButton();
            menyu.setText("\uD83C\uDFE1 Asosiy menyu");

            row1.add(Dilerlar);
            row1.add(aloqa);
            row2.add(menyu);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("◀️\uFE0F Orqaga");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("◀️\uFE0F Назадд")) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton Дилеры = new KeyboardButton();
            Дилеры.setText("\uD83D\uDCCD\uFE0F Дилеры");
            KeyboardButton центр = new KeyboardButton();
            центр.setText("\uD83D\uDC54 Контакт-центр Киа Узбекистан");
            KeyboardButton меню = new KeyboardButton();
            меню.setText("\uD83C\uDFE1 Главное меню");

            row1.add(Дилеры);
            row1.add(центр);
            row2.add(меню);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);

            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            markup.setSelective(true);
            SendMessage message = new SendMessage();
            message.setText("◀️\uFE0F Назад");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String getBotUsername () {
        return "t.me/Uz_AutoElonBot";
    }
}