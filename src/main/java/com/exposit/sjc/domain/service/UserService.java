package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.UserPrincipal;

import java.util.List;

public interface UserService {

    UserPrincipal loadUserByCredentials(String login, String password);

    UserPrincipal getUserByID(Long userId);

    UserPrincipal getUserByName(String username);
    List<UserEntity> getUsers();
   // UserEntity getUserByID(Long userId);

   // UserEntity loadUserByCredentials(String login, String password);
UserEntity loadUserByName(String userName);
void save(UserEntity user);
    void updateUser(UserEntity user);


}
