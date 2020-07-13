package com.project.api.model;

import java.sql.Date;


public class ShareRideModel {

	private String to_address;
	private String subject;
	private String source;
	private String destination;
	private Date dateofride;
	private String timeofride;
	
	private String message;

	public String getTo_address() {
		return to_address;
	}

	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public Date getDateofride() {
		return dateofride;
	}

	public void setDateofride(Date dateofride) {
		this.dateofride = dateofride;
	}

	public String getTimeofride() {
		return timeofride;
	}

	public void setTimeofride(String timeofride) {
		this.timeofride = timeofride;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
