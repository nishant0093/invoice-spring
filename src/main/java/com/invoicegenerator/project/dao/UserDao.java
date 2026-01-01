package com.invoicegenerator.project.dao;

import org.springframework.stereotype.Repository;

import com.invoicegenerator.project.model.SignupForm;

@Repository
public interface UserDao {

	public void Signup(SignupForm form);
	public String login(SignupForm form);
	
}
