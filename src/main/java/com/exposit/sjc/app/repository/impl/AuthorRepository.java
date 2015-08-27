package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.AuthorDao;
import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository extends AbstractHibernateDao<AuthorEntity, Long> implements AuthorDao {
    @Override
    public AuthorEntity findById(Long authorId) {
        Criteria cr = getSession().createCriteria(AuthorEntity.class, "AuthorEntity")
                .add(Restrictions.eq("idAuthor", authorId));
        return (AuthorEntity) cr.uniqueResult();
    }



}
