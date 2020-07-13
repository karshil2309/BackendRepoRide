/**
 * 					Author : Karshil Sheth	
 * 					Date   : 12 May, 2020
 * 					POC	   : Admin Login Rest Api in Spring Boot 
 *
 * 					Features Left : 1) No Validation Support from Server Side
 * 									2) Only Email and Password are req fields for Logged in Support
 * 
 * 
 * 
 * */
package com.project.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theadmins")
public class AdminLoginModel {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="adminid")
		private int adminid;
		@Column(name="adminemail")
		private String adminemail;
		@Column(name="adminpasswrd")
		private String adminpasswrd;
		@Override
		public String toString() {
			return "AdminLoginModel [adminid=" + adminid + ", adminemail=" + adminemail + ", adminpasswrd="
					+ adminpasswrd + "]";
		}
		public int getAdminid() {
			return adminid;
		}
		public void setAdminid(int adminid) {
			this.adminid = adminid;
		}
		public String getAdminemail() {
			return adminemail;
		}
		public void setAdminemail(String adminemail) {
			this.adminemail = adminemail;
		}
		public String getAdminpasswrd() {
			return adminpasswrd;
		}
		public void setAdminpasswrd(String adminpasswrd) {
			this.adminpasswrd = adminpasswrd;
		}
}
