package com.invoicegenerator.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invoicegenerator.project.model.SignupForm;
import com.invoicegenerator.project.service.OtpService;
import com.invoicegenerator.project.service.UserService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class SignupController {

    private static final Logger logger =
            LoggerFactory.getLogger(SignupController.class);
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private OtpService otpService;
    
	@PostMapping("/signup")
	public void createAccount(@RequestBody SignupForm form) {
		
		
		try {
			logger.info("Inside create account method");
			userService.Signup(form, logger);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		
	}
	
	@PostMapping("/login")
	public String login(@RequestBody SignupForm form) {
		
		String login = "";
		try {
			logger.info("Inside create account method");
			login =userService.login(form, logger);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		return login;
	}
	
	@GetMapping("/forgotpass")
	public String resetPass(@RequestParam String email) {
		
		String otp = "";
		try {
			otp = otpService.generateOtp(email);
			logger.info("Inside resetPass method");
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		return otp;
	}
	
	@PostMapping("/verifyotp")
	public String verifyOtp(@RequestParam String otp) {
		String verified = "";
		try {
			otp = otpService.verifyOtp(otp);
			logger.info("Inside verifyOtp method");
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		return verified;
	}
	
}
