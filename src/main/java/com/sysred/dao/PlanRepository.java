package com.sysred.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sysred.model.Plan;

public interface PlanRepository extends JpaRepository<Plan,Long> {

}
