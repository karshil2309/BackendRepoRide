package com.project.api.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "rid")
public class RideDetailsModel {		

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer rid;
		private String source;
		private String destination;
		private Date date;
		private Time time;
		private Integer riderate;
		
		@ManyToOne
		@JoinColumn(name="driverid", insertable=false, updatable=false)
		private DriverLoginModel driverloginmodel;
		private Integer driverid;
//		private String driverfirstname;
//		private String driverlastname;
//		
		public Integer getRid() {
			return rid;
		}
		public void setRid(Integer rid) {
			this.rid = rid;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Time getTime() {
			return time;
		}
		public void setTime(Time time) {
			this.time = time;
		}
		public Integer getRiderate() {
			return riderate;
		}
		public void setRiderate(Integer riderate) {
			this.riderate = riderate;
		}
		public DriverLoginModel getDriverloginmodel() {
			return driverloginmodel;
		}
		public void setDriverloginmodel(DriverLoginModel driverloginmodel) {
			this.driverloginmodel = driverloginmodel;
		}
		public Integer getDriverid() {
			return driverid;
		}
		public void setDriverid(Integer driverid) {
			this.driverid = driverid;
		}
		
		
		
}
