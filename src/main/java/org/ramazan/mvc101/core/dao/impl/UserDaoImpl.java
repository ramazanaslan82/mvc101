package org.ramazan.mvc101.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.ramazan.mvc101.core.dao.UserDao;
import org.ramazan.mvc101.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Resource
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public User loadUser(Long userId) {
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("id", userId));
		
		@SuppressWarnings("unchecked")
		List<User> users = ( List<User> )criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).setFetchSize(1).list();
		return users.get(0);
	}
	
}
