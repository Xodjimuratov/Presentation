package org.example.service;

import org.example.modul.User;

public interface UserService {
    User create(User user);
    User get(long chatId);
    void update(long chatId, User user);
}
