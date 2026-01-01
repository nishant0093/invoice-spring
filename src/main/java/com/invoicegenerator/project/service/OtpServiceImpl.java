package com.invoicegenerator.project.service;

import java.security.SecureRandom;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoicegenerator.project.dao.OtpRepository;
import com.invoicegenerator.project.entity.OtpEntity;
import com.invoicegenerator.project.util.PasswordUtil;

@Service
public class OtpServiceImpl implements OtpService{

	@Autowired
	private OtpRepository otprepo;
	
	@Autowired
	private PasswordUtil passwordUtil;
	
	@Override
	public String generateOtp(String email) {
		StringBuilder sb = new StringBuilder();
		SecureRandom secureRandom = new SecureRandom();
		for(int i=1; i<=6; i++) {
			sb.append(String.valueOf(secureRandom.nextInt(10)));
		}
		
		String hashOtp = passwordUtil.hashPassword(sb.toString());
		
		otprepo.save(new OtpEntity(email, hashOtp, LocalDateTime.now().plusMinutes(5), false));
		
		return sb.toString();
	}

	@Override
	public String verifyOtp(String otp) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
