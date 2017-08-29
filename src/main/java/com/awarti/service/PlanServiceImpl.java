package com.awarti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.awarti.dao.PlanDao;
import com.awarti.model.Plan;
@Service("PlanService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class PlanServiceImpl  implements PlanService {

	@Autowired
	private PlanDao planDao;
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void addPlan(Plan plan) {
		planDao.addPlan(plan);
		
	}
}
