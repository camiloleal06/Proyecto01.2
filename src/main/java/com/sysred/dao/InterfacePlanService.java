package com.sysred.dao;


import com.sysred.model.Plan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InterfacePlanService {
	
	public List<Plan> findAll();

	public Page<Plan> findAll(Pageable pageable);

	public void save(Plan plan);

	public Plan findOne(Long id);

	public void delete(Long id);

	public void delete(Plan plan);
}