package com.project.api.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rateride")
public class RateRideModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rateid")
	private Integer rateid;
	@Column(name="rate")
	private Integer rate;
	@Column(name="distance")
	private Integer distance;

	@ManyToOne
	@JoinColumn(name="rid", insertable=false, updatable=false)
	private RideDetailsModel ridedetailsmodel;
//	private Integer rid;
//	private String source;
//	private String destination;
//	private Date date;
	public Integer getRateid() {
		return rateid;
	}
	public void setRateid(Integer rateid) {
		this.rateid = rateid;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public RideDetailsModel getRidedetailsmodel() {
		return ridedetailsmodel;
	}
	public void setRidedetailsmodel(RideDetailsModel ridedetailsmodel) {
		this.ridedetailsmodel = ridedetailsmodel;
	}
//	public Integer getRid() {
//		return rid;
//	}
//	public void setRid(Integer rid) {
//		this.rid = rid;
//	}
//	public String getSource() {
//		return source;
//	}
//	public void setSource(String source) {
//		this.source = source;
//	}
//	public String getDestination() {
//		return destination;
//	}
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	@Override
	public String toString() {
		return "RateRideModel [rateid=" + rateid + ", rate=" + rate + ", distance=" + distance + ", ridedetailsmodel="
				+ ridedetailsmodel + "]";
	}
	
	

	
}
