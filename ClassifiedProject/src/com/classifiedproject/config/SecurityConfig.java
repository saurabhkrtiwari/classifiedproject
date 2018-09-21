package com.classifiedproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	@Bean
	public BCryptPasswordEncoder bcryptInstance()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	public SecurityConfig() {
		System.out.println("From Security Configuration");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/login").permitAll()		
			.and()
			.authorizeRequests().antMatchers("/profile").hasRole("USER")
			.and()
			.authorizeRequests().antMatchers("/authenticated").hasRole("USER")
			.and()
			.authorizeRequests().antMatchers("/admin").hasRole("Admin")
			.and()
			.formLogin().loginPage("/login").permitAll()
			.and()
			.csrf().disable();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("Saurabh").password(bcrypt.encode("password")).roles("USER").and()
		.withUser("Admin").password(bcrypt.encode("password")).roles("USER","ADMIN");
	}
}

