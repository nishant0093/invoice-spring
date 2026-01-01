package com.invoicegenerator.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.invoicegenerator.project.entity.CompanyEntity;
import com.invoicegenerator.project.model.SignupForm;
import com.invoicegenerator.project.util.PasswordUtil;

@Repository
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordUtil passwordUtil;

  
	
	@Override
	public void Signup(SignupForm form) {
		// TODO Auto-generated method stub
		try {
			String hashPassword = passwordUtil.hashPassword(form.getPassword());
			CompanyEntity entity = new CompanyEntity(form.getCompanyName(), form.getCompanyEmail(), 
					hashPassword, hashPassword);
			
			userRepo.save(entity);
		} catch (Exception e) {
			
		}
	}

	@Override
	public String login(SignupForm form) {
		// TODO Auto-generated method stub
		String response = "";
		try {
			String hashedPass = userRepo.getPassword(form.getCompanyEmail());
			
			boolean matches = passwordUtil.matches(form.getPassword(), hashedPass);
			
			response = matches?"0":"1";
		} catch (Exception e) {
			
		}
		return response;
	}

}
