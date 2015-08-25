package com.exposit.sjc.app.repository.dao;

import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.app.repository.base.GenericDao;
import com.exposit.sjc.domain.model.User;

/**
 * Created by Админ on 21.08.2015.
 */
public interface UserDao extends GenericDao<UserEntity, Long> {

    void updateUser(User user);
}
