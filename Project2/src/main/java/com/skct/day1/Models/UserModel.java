package com.skct.day1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserModel 
{
	@Id
    private String Id;
	private String Email;
	private String Password;
	private String Username;
	private String MobileNumber;
	private String UserRole;
	private int LoanId;
	private String loanModels;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public String getLoanModels() {
		return loanModels;
	}
	public void setLoanModels(String loanModels) {
		this.loanModels = loanModels;
	}
	
	
	

}
