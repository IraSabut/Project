package com.exposit.sjc.app.repository.dao;

import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.app.repository.base.GenericDao;
import com.exposit.sjc.domain.model.User;


public interface UserDao extends GenericDao<UserEntity, Long> {

    void updateUser(UserEntity user);
    UserEntity findByCredentials(String login, String password);

    UserEntity findByName(String userName);
}
