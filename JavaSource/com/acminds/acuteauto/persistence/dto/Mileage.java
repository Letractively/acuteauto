package com.acminds.acuteauto.persistence.dto;

// Generated Feb 29, 2012 11:25:37 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mileage generated by customhbm2java
 */
import javax.faces.bean.ManagedBean;

import com.acminds.acuteauto.persistence.entities.AbstractMileage;

@ManagedBean(name = "mileage")
@Entity
@Table(name = "MILEAGE", catalog = "carobar")
public class Mileage extends AbstractMileage {
	private static final long serialVersionUID = 1L;

}
