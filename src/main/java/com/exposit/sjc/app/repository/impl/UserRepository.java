package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.BookDao;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import com.exposit.sjc.app.repository.entity.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.exposit.sjc.app.repository.dao.UserDao;
/**
 * Created by Админ on 21.08.2015.
 */
@Repository
public class UserRepository  extends AbstractHibernateDao<UserEntity, Long> implements UserDao {
    @Override
    public UserEntity findById(Long userId) {
        Criteria cr = getSession().createCriteria(UserEntity.class, "UserEntity")
                .add(Restrictions.eq("idUser", userId));
        return (UserEntity) cr.uniqueResult();
    }
}
