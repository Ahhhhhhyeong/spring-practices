package com.douzone.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.user.Friend;
import com.douzone.container.user.User;

@Configuration
public class AppConfig02 {
	@Bean
	public Friend friend() {
		return new Friend("김정자");
	}
	
	
	@Bean
	public User user() { // 명시적으로 빈설정
		User user = new User();
		user.setNo(1L);
		user.setName("둘리");
		return user;
	}
}
