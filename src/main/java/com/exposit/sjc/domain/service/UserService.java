package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.User;

import java.util.List;

/**
 * Created by Админ on 21.08.2015.
 */
public interface UserService {
    public void addUser(User contact);

    List<UserEntity> getUsers();
    UserEntity getUserByID(Long userId);

    public void removeUser(Integer id);


    void updateUser(UserEntity user);
}
