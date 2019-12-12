package com.incture.demo.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.incture.demo.dto.BaseDto;
import com.incture.demo.entity.BaseDo;

public abstract class BaseDao<E extends BaseDo, D extends BaseDto> {

	@Autowired
	private SessionFactory sessionFactory;

	protected abstract E importDto(D fromDto);

	protected abstract D exportDto(E entity);

	public Session getSession() {
		try {

			return sessionFactory.getCurrentSession();
		} catch (

		HibernateException e) {
			return sessionFactory.openSession();

		}

	}

}
