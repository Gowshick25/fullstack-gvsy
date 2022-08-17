//package com.example.demo.auth;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//@Configuration
//@EnableGlobalMethodSecurity(jsr250Enabled = true)
//public class EmployeeAuth {
//	@Autowired
//	private  BCryptPasswordEncoder encoder;
//
//		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//			
//			auth.inMemoryAuthentication().withUser("gowse").password(encoder.encode("gowse123")).roles("USER");
//		}
//
//		protected void configure(HttpSecurity http) throws Exception {
//			
//			http.authorizeRequests().antMatchers("/api/v1/**").authenticated().and().httpBasic();
//		}
//
//
//}
