package com.awarti.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.awarti.model.Plan;
@Repository("PlanDao")
public class PlanDaoImpl implements PlanDao {

	@Autowired
	
	SessionFactory sessionFactory;
	public void addPlan(Plan plan) {
		sessionFactory.getCurrentSession().saveOrUpdate(plan);
	}

}
