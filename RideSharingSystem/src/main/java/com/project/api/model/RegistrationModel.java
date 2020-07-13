package com.project.api.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "thekingriders")
public class RegistrationModel {
	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="userid")
		private Integer userid;
		@Column(name="firstName")
		private String firstName;
		
		@Column(name="lastName")
		private String lastName;
		@Column(name="email")
		private String email;
		@Column(name="passwrd")
		private String passwrd;
		@Column(name="dateOfBirth")
		private Date dateOfBirth;
		@Column(name="address")
		private String address;
		@Column(name="creditInfo")
		private Double creditInfo;
//		@Column(name="phoneNumber")
//		private Integer phoneNumber;
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPasswrd() {
			return passwrd;
		}
		public void setPasswrd(String passwrd) {
			this.passwrd = passwrd;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Double getCreditInfo() {
			return creditInfo;
		}
		public void setCreditInfo(Double creditInfo) {
			this.creditInfo = creditInfo;
		}
		@Override
		public String toString() {
			return "RegistrationModel [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", passwrd=" + passwrd + ", dateOfBirth=" + dateOfBirth + ", address="
					+ address + ", creditInfo=" + creditInfo + "]";
		}
		
		
		
}
