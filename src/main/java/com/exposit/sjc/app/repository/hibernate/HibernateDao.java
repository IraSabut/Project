

package com.exposit.sjc.app.repository.hibernate;


import com.exposit.sjc.app.repository.base.GenericDao;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface HibernateDao<T, PK extends Serializable> extends GenericDao<T, PK> {

	List<T> findByCriteria(Criterion criterion);

}