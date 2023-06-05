package com.example.demo.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
		http.csrf().disable();
		http.formLogin().disable();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		// ok for demo
		org.springframework.security.core.userdetails.User.UserBuilder users = org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder();

		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("user").password("password").roles("role1").build());
		manager.createUser(users.username("admin").password("password").roles("role2").build());
		return manager;
	}

}
