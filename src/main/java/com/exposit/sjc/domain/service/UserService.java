package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.User;

import java.util.List;

public interface UserService {


    List<UserEntity> getUsers();
    UserEntity getUserByID(Long userId);

    UserEntity loadUserByCredentials(String login, String password);
UserEntity loadUserByName(String userName);
void save(UserEntity userEntity);
    void updateUser(UserEntity user);


}
