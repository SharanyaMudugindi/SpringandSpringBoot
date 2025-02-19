package com.example.spring_security_6.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.
		csrf(csrf->csrf.disable()).authorizeHttpRequests(request->request.anyRequest().authenticated()
				).formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		return httpSecurity.build();	}
	@Bean
	public UserDetailsService userDetailService() {
	    UserDetails sharanya = User.withUsername("Sharanya")
	                                .password("{noop}aynarahS2443") 
	                                .roles("USER")
	                                .build();
	    UserDetails sharanya1 = User.withUsername("Sharanya1")
                .password("{noop}aynarahS24431")  
                .roles("USER")
                .build();
	    return new InMemoryUserDetailsManager(sharanya,sharanya1);
	}


}