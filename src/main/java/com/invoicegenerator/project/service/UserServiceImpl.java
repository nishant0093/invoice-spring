package com.invoicegenerator.project.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoicegenerator.project.dao.UserDao;
import com.invoicegenerator.project.model.SignupForm;
import com.invoicegenerator.project.util.PasswordUtil;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Autowired
	private PasswordUtil passwordUtil;
	
	@Override
	public void Signup(SignupForm form, Logger log) {
		try {
			
			log.info("inside userServiceImpl.signup method");
			userdao.Signup(form);
						
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Exception occured at userServiceImpl.signup method"+e.getMessage());
		}
		
	}

	@Override
	public String login(SignupForm form, Logger log) {
		String login = "";
		// TODO Auto-generated method stub
		try {
			
			log.info("inside userServiceImpl.signup method");
			login = userdao.login(form);
						
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Exception occured at userServiceImpl.signup method"+e.getMessage());
		}
		return login;
		
	}
	

}
