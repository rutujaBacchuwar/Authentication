package com.stackroute.UserAuthentication;

import com.stackroute.UserAuthentication.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserAuthenticationApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/v1/*");
		return registrationBean;
	}


	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationApplication.class, args);
	}

}
