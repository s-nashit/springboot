package org.culture.heritage.repository;



import java.util.List;

import org.culture.heritage.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserDtls, Integer> {
	public UserDtls findByEmail(String email);
	
	public UserDtls findByResetToken(String token);


	
	 public List<UserDtls> findByRole(String role);
	 
}
