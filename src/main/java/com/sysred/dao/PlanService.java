package com.sysred.dao;

import com.sysred.model.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService implements InterfacePlanService {

	@Autowired
	private PlanRepository planDao;
	
	@Override
	public List<Plan> findAll() {
		return (List<Plan>)planDao.findAll();
	}

	@Override
	public Page<Plan> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Plan plan) {
		// TODO Auto-generated method stub
		planDao.save(plan);
		
	}

	@Override
	public Plan findOne(Long id) {
		// TODO Auto-generated method stub
		return planDao.getById(id);
// @formatter:on

	}


	public void delete(Plan plan) {
		// TODO Auto-generated method stub
		planDao.delete(plan);
		
	}

	@Override
	public void delete(Long id) {
		planDao.deleteById(id);
		
	}

}
