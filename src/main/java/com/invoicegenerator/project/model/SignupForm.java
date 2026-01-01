package com.invoicegenerator.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignupForm {
	
	private String companyName;
	private String companyEmail;
	private String password;
	private String confirmPassword;
	
	public SignupForm() {
		
	}
	
	public SignupForm(String companyName, String companyEmail, String password, String confirmPassword) {
		super();
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	

}
