package com.project.api.model;



import java.sql.Date;
import java.sql.Time;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "theridedetails")
public class RiderSubscriberModel {


			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="subscribeid")
			private Integer subscribeid;
			@Column(name="ridername")
			private String ridername;
			@Column(name="dateofride")
			private Date dateofride;		
			@Column(name="timetostart")
			private Time timetostart;
			public Time getTimetostart() {
				return timetostart;
			}
			public void setTimetostart(Time timetostart) {
				this.timetostart = timetostart;
			}
			@Column(name="sourcename")
			private String sourcename;
			@Column(name="destinationname")
			private String destinationname;
			@Column(name="carname")
			private String carname;
			public Integer getSubscribeid() {
				return subscribeid;
			}
			public void setSubscribeid(Integer subscribeid) {
				this.subscribeid = subscribeid;
			}
			public String getRidername() {
				return ridername;
			}
			public void setRidername(String ridername) {
				this.ridername = ridername;
			}
			public Date getDateofride() {
				return dateofride;
			}
			public void setDateofride(Date dateofride) {
				this.dateofride = dateofride;
			}

			public String getSourcename() {
				return sourcename;
			}
			public void setSourcename(String sourcename) {
				this.sourcename = sourcename;
			}
			public String getDestinationname() {
				return destinationname;
			}
			@Override
			public String toString() {
				return "RiderSubscriberModel [subscribeid=" + subscribeid + ", ridername=" + ridername + ", dateofride="
						+ dateofride + ", timetostart=" + timetostart + ", sourcename=" + sourcename
						+ ", destinationname=" + destinationname + ", carname=" + carname + "]";
			}
			public void setDestinationname(String destinationname) {
				this.destinationname = destinationname;
			}
			public String getCarname() {
				return carname;
			}
			public void setCarname(String carname) {
				this.carname = carname;
			}
			

}
