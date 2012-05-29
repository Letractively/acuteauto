package com.acminds.acuteauto.persistence.entities;

// Generated Mar 3, 2012 9:48:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Client generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractClient extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer clientId;
	private String clientName;
	private String caption;
	private String clientDesc;
	private Integer yearEstd;
	private String registeredName;
	private List<Location> locations = new ArrayList<Location>(0);
	private List<UserInfo> userInfos = new ArrayList<UserInfo>(0);
	private List<Image> images = new ArrayList<Image>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CLIENT_ID", unique = true, nullable = false)
	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	@Column(name = "CLIENT_NAME", nullable = false, length = 60)
	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Column(name = "CAPTION", length = 100)
	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Column(name = "CLIENT_DESC", length = 200)
	public String getClientDesc() {
		return this.clientDesc;
	}

	public void setClientDesc(String clientDesc) {
		this.clientDesc = clientDesc;
	}

	@Column(name = "YEAR_ESTD")
	public Integer getYearEstd() {
		return this.yearEstd;
	}

	public void setYearEstd(Integer yearEstd) {
		this.yearEstd = yearEstd;
	}

	@Column(name = "REGISTERED_NAME", length = 60)
	public String getRegisteredName() {
		return this.registeredName;
	}

	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public List<Location> getLocations() {
		return this.locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public List<UserInfo> getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public List<Image> getImages() {
		return this.images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}
