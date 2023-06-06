package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

	/*
	 * @Bean public InMemoryUserDetailsManager userDetailsManager() { UserDetails
	 * john =
	 * User.builder().username("john").password("{noop}test123").roles("EMPLOYEE").
	 * build(); UserDetails marry =
	 * User.builder().username("marry").password("{noop}test123").roles("EMPLOYEE",
	 * "MANAGER") .build(); UserDetails susan =
	 * User.builder().username("susan").password("{noop}test123") .roles("EMPLOYEE",
	 * "MANAGER", "ADMIN").build(); return new InMemoryUserDetailsManager(john,
	 * marry, susan); }
	 */
	
	@Bean
	public UserDetailsManager userDetailsmanager(DataSource dataSource)
	{
	  return	new JdbcUserDetailsManager(dataSource);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configurer -> configurer.antMatchers(HttpMethod.GET, "/todos").hasRole("EMPLOYEE")
				.antMatchers(HttpMethod.POST, "/todos").hasRole("MANAGER")
				.antMatchers(HttpMethod.PUT, "/todos/**").hasRole("ADMIN")
				.antMatchers(HttpMethod.DELETE, "/todos/**").hasRole("ADMIN"));
		http.httpBasic(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());
		http.authorizeHttpRequests().antMatchers("/h2-console/**").permitAll();
        http.headers(headers -> headers.frameOptions().disable());
		return http.build();

	}
}
