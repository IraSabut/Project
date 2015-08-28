package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.BookDao;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.exposit.sjc.app.repository.dao.UserDao;

@Repository
public class UserRepository  extends AbstractHibernateDao<UserEntity, Long> implements UserDao {
    @Override
    public UserEntity findById(Long userId) {
        Criteria cr = getSession().createCriteria(UserEntity.class, "UserEntity")
                .add(Restrictions.eq("idUser", userId));
        return (UserEntity) cr.uniqueResult();
    }

    @Override
    public void updateUser(UserEntity user) {

    }

    @Override
    public UserEntity findByCredentials(String login, String password) {
        Criteria cr = getSession()
                .createCriteria(UserEntity.class, "users")
                .add(Restrictions.eq("login", login))
                .add(Restrictions.eq("password", password));
        return (UserEntity) cr.uniqueResult();
    }


    @Override
    public UserEntity findByName(String userName) {
        Criteria cr = getSession()
                .createCriteria(UserEntity.class, "users")
                .add(Restrictions.like("login", userName));
        return (UserEntity) cr.uniqueResult();
    }
}
