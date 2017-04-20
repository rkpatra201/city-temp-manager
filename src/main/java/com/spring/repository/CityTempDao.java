package com.spring.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.command.CityTemp;

@Repository
public class CityTempDao {

	private SessionFactory sessionFactory;

	// setter for hibernateTemplate
	@Autowired
	public void setHibernateTemplate( SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<CityTemp> loadAll(String prefix) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("FROM CityTemp as p WHERE p.name like :name");
		query.setParameter("name", prefix+"%");
		return query.list();
	}

}