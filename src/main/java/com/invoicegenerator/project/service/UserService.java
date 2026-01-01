package com.invoicegenerator.project.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.invoicegenerator.project.model.SignupForm;

@Service
public interface UserService {

	public void Signup(SignupForm form, Logger log);
	public String login(SignupForm form, Logger log);
	
}
