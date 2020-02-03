package com.example.jpa.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	private PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
	}
	
@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	return new User("saber", passwordEncoder().encode("password"), AuthorityUtils.NO_AUTHORITIES);
}

public void save(AppUser user) {
	this.userRepository.save(user);
}

}
