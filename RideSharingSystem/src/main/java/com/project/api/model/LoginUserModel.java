package com.project.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thekingriders")
public class LoginUserModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	private int userid;
	@Column(name="firstName")
	private String firstName;
	@Column(name="email")
	private String email;
	@Column(name="passwrd")
	private String passwrd;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	@Override
	public String toString() {
		return "LoginUserModel [userid=" + userid + ", firstName=" + firstName + ", email=" + email + ", passwrd="
				+ passwrd + "]";
	}
	
}
