package com.project.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theprimedrivers")
public class DriverLoginModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="driverid")
	private Integer driverid;
	
	@Column(name="driverfirstname")
	private String driverfirstname;

	@Column(name="driverlastname")
	private String driverlastname;
	
	@Column(name="driverdob")
	private Date driverdob;
	
	@Column(name="driverphonenum")
	private Long driverphonenum;
	
	@Column(name="driverlicensenum")
	private Double driverlicensenum;
	
	@Column(name="driveremail")
	private String driveremail;
	
	@Column(name="driverpassword")
	private String driverpassword;
	
	
	@Column(name="driveraccount")
	private Long driveraccount;

	@Override
	public String toString() {
		return "DriverLoginModel [driverid=" + driverid + ", driverfirstname=" + driverfirstname + ", driverlastname="
				+ driverlastname + ", driverdob=" + driverdob + ", driverphonenum=" + driverphonenum
				+ ", driverlicensenum=" + driverlicensenum + ", driveremail=" + driveremail + ", driverpassword="
				+ driverpassword + ", driveraccount=" + driveraccount
				+ "]";
	}

	public Integer getDriverid() {
		return driverid;
	}

	public void setDriverid(Integer driverid) {
		this.driverid = driverid;
	}

	public String getDriverfirstname() {
		return driverfirstname;
	}

	public void setDriverfirstname(String driverfirstname) {
		this.driverfirstname = driverfirstname;
	}

	public String getDriverlastname() {
		return driverlastname;
	}

	public void setDriverlastname(String driverlastname) {
		this.driverlastname = driverlastname;
	}

	public Date getDriverdob() {
		return driverdob;
	}

	public void setDriverdob(Date driverdob) {
		this.driverdob = driverdob;
	}

	public Long getDriverphonenum() {
		return driverphonenum;
	}

	public void setDriverphonenum(Long driverphonenum) {
		this.driverphonenum = driverphonenum;
	}

	public Double getDriverlicensenum() {
		return driverlicensenum;
	}

	public void setDriverlicensenum(Double driverlicensenum) {
		this.driverlicensenum = driverlicensenum;
	}

	public String getDriveremail() {
		return driveremail;
	}

	public void setDriveremail(String driveremail) {
		this.driveremail = driveremail;
	}

	public String getDriverpassword() {
		return driverpassword;
	}

	public void setDriverpassword(String driverpassword) {
		this.driverpassword = driverpassword;
	}


	public Long getDriveraccount() {
		return driveraccount;
	}

	public void setDriveraccount(Long driveraccount) {
		this.driveraccount = driveraccount;
	}
}
