package com.saurav.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfiguration {
	
	@Bean
	public SecurityFilterChain securityAutho(HttpSecurity http) throws Exception {
		
				http.authorizeHttpRequests(
				auth -> auth.antMatchers("/saurav/admin/**").hasAuthority("ADMIN")
				.antMatchers("/saurav/user/**").hasAuthority("USER")
				.antMatchers("/saurav/user/register","/saurav/admin/register","/saurav/user/loin","/saurav/admin/login").permitAll()
				
				).csrf().disable().httpBasic();
		
		
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder passwordEncode() {	
		return NoOpPasswordEncoder.getInstance();   
	}

}
