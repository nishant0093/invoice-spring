package com.invoicegenerator.project.service;

import org.springframework.stereotype.Service;

@Service
public interface OtpService {

	public String generateOtp(String email);
	
	public String verifyOtp(String otp);
	
}
