package org.example.modul;

public class User {
    private long chatId;
    private String fullName;
    private BotState state;
    private Language lang;

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", fullName='" + fullName + '\'' +
                ", state=" + state +
                '}';
    }

    public User(long chatId, String fullName, BotState state) {
        this.chatId = chatId;
        this.fullName = fullName;
        this.state = state;
    }

    public User() {
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BotState getState() {
        return state;
    }

    public void setState(BotState state) {
        this.state = state;
    }
}
