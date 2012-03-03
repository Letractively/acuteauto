package com.acminds.acuteauto.persistence.entities;

// Generated Mar 3, 2012 9:48:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Model generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractModel extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer modelId;
	private Make make;
	private String name;
	private String description;
	private int yearStart;
	private Integer yearEnd;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>(0);
	private List<Style> styles = new ArrayList<Style>(0);
	private List<FindVehicle> findVehicles = new ArrayList<FindVehicle>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MODEL_ID", unique = true, nullable = false)
	public Integer getModelId() {
		return this.modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAKE_ID", nullable = false)
	public Make getMake() {
		return this.make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

	@Column(name = "NAME", nullable = false, length = 60)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "YEAR_START", nullable = false)
	public int getYearStart() {
		return this.yearStart;
	}

	public void setYearStart(int yearStart) {
		this.yearStart = yearStart;
	}

	@Column(name = "YEAR_END")
	public Integer getYearEnd() {
		return this.yearEnd;
	}

	public void setYearEnd(Integer yearEnd) {
		this.yearEnd = yearEnd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
	public List<Style> getStyles() {
		return this.styles;
	}

	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
	public List<FindVehicle> getFindVehicles() {
		return this.findVehicles;
	}

	public void setFindVehicles(List<FindVehicle> findVehicles) {
		this.findVehicles = findVehicles;
	}

}