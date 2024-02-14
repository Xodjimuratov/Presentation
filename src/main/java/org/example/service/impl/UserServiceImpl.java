package org.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.example.modul.User;
import org.example.service.FileService;
import org.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private FileService fileService = new FileServiceImpl();
    private final String fileName = "users.txt";
    @Override
    public User create(User user) {
        String dataFromFile = fileService.getDataFromFile(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> list = objectMapper.readValue(dataFromFile, List.class);
            list.add(user);
            Gson gson = new Gson();
            String json = gson.toJson(list);
            boolean b = fileService.writeDateToFile(json, fileName);
            System.out.println(b);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public User get(long chatId) {
        String dataFromFile = fileService.getDataFromFile(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> list = objectMapper.readValue(dataFromFile, List.class);
            for (User user : list) {
                if (user.getChatId() == chatId){
                    return user;
                }
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(long chatId, User user) {
        String dataFromFile = fileService.getDataFromFile(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> list = objectMapper.readValue(dataFromFile, List.class);
            for (User oldUser : list) {
                if (oldUser.getChatId() == chatId){
                    if (user.getState() != null){
                        oldUser.setState(user.getState());
                    }
                    if (user.getFullName() != null){
                        oldUser.setFullName(user.getFullName());
                    }
                }
            }
            Gson gson = new Gson();
            String json = gson.toJson(list);
            boolean b = fileService.writeDateToFile(json, fileName);
            System.out.println(b);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
