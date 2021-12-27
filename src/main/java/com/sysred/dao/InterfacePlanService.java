package com.sysred.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.sysred.model.Plan;

public interface InterfacePlanService {
	
	public List<Plan> findAll();

	public Page<Plan> findAll(Pageable pageable);

	public void save(Plan plan);

	public Plan findOne(Long id);

	public void delete(Long id);

	public void delete(Plan plan);
}