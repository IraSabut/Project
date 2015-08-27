
package com.exposit.sjc.app.repository.base;

import com.exposit.sjc.domain.model.User;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {

	PK save(T obj);

	void update(T obj);

	List<T> findAll();

	T findById(PK id);


	void delete(PK id);

	void delete(T persistentObject);


}