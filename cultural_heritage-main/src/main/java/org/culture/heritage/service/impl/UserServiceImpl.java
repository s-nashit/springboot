package org.culture.heritage.service.impl;

import org.culture.heritage.model.UserDtls;
import org.culture.heritage.repository.UserRepository;
import org.culture.heritage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	


	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDtls saveUser(UserDtls user) {
		user.setRole("ROLE_USER");
		/*
		 * user.setIsEnable(true); user.setAccountNonLocked(true);
		 * user.setFailedAttempt(0);
		 */

		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		UserDtls saveUser = userRepository.save(user);
		return saveUser;
	}
	
	@Override
	public UserDtls getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	@Override
	public void updateUserResetToken(String email, String resetToken) {
		UserDtls findByEmail = userRepository.findByEmail(email);
		findByEmail.setResetToken(resetToken);
		userRepository.save(findByEmail);
	}

	@Override
	public UserDtls getUserByToken(String token) {
		return userRepository.findByResetToken(token);
	}
	
	@Override
	public UserDtls updateUser(UserDtls user) {
		return userRepository.save(user);
	}
	
	 
	

	}
