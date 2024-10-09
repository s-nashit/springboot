package in.nsti.patna.firstboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails admin = User.builder()
				.username("nashit")
				.password(passwordEncoder().encode("patna"))
				.roles("ADMIN")
				.build();
		
		UserDetails user= User.builder()
				.username("mukesh")
				.password(passwordEncoder().encode("bihar"))
				.roles("ADMIN")
				.build();
				
		return new InMemoryUserDetailsManager(admin,user);
	}
	
//	@Bean
//	SecurityFilterChain fC(HttpSecurity http) throws Exception {
//		http
//		.authorizeHttpRequests()
//		.anyRequest()
//		.permitAll();
//		return http.build();
//	}
	
	@Bean
	public SecurityFilterChain sFC(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests((authorize) ->authorize.anyRequest().authenticated())
		.formLogin().loginPage("/login").permitAll();
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
