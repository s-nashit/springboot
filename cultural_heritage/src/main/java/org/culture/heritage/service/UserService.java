package org.culture.heritage.service;

import org.culture.heritage.model.UserDtls;

public interface UserService {

	public UserDtls saveUser(UserDtls user);
	public UserDtls getUserByEmail(String email);
	public void updateUserResetToken(String email, String resetToken);
	
	public UserDtls getUserByToken(String token);
	
	public UserDtls updateUser(UserDtls user);
}
