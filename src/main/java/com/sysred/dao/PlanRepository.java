package com.sysred.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysred.model.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Long> {

}
