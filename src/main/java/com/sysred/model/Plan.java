package com.sysred.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="planes")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombrePlan;
	private double precioPlan;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaCreacion;
	
	
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Se ejecuta antes de persistir en BD y se agrega automaticamente
	@PrePersist
	public void prePersist() {
		fechaCreacion=new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombrePlan() {
		return nombrePlan;
	}
	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}
	public double getPrecioPlan() {
		return precioPlan;
	}
	public void setPrecioPlan(double precioPlan) {
		this.precioPlan = precioPlan;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	

}
