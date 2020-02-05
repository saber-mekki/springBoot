package com.example.jpa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
private final String[] PUBLIC_ENDPOINT= {
		"/auth/**",
	
		};


@Override
@Bean
public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
}

@Bean
AuthFilter authFilter() {
    return new AuthFilter();
}


@Override
	protected void configure(HttpSecurity http) throws Exception {
 http
     .cors().and().csrf().disable()
     .sessionManagement()
     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
     .and()
     .authorizeRequests()
          .antMatchers(PUBLIC_ENDPOINT).permitAll()
          .anyRequest().authenticated()
          .and()
 .addFilterBefore(authFilter(), UsernamePasswordAuthenticationFilter.class);
	}













}
