package com.example.jpa.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
private final String[] PUBLIC_ENDPOINT= {
		"/auth/**",	
		};


@Override
	protected void configure(HttpSecurity http) throws Exception {
 http
     .cors().and().csrf().disable()
     .sessionManagement()
     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
     .and()
     .authorizeRequests()
          .antMatchers(PUBLIC_ENDPOINT).permitAll()
          .anyRequest().authenticated();
	}













}
