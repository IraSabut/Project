
package com.exposit.sjc.app.repository.impl;

import com.exposit.sjc.app.repository.dao.BookDao;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.hibernate.AbstractHibernateDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository extends AbstractHibernateDao<BookEntity, Long> implements BookDao {

    @Override
    public BookEntity findById(Long bookId) {
        Criteria cr = getSession().createCriteria(BookEntity.class, "BookEntity")
                .add(Restrictions.eq("idBook", bookId));
        return (BookEntity) cr.uniqueResult();
    }




}
