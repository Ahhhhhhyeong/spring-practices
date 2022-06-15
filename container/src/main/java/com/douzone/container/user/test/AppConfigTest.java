package com.douzone.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig01;
import com.douzone.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
//		testAppConfig01();
		testAppConfig02();
	}
	
	// Java Config 01
	// 직접 자바 클래스(Config Class)를 전달
	private static void testAppConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
	
	// Java Config 02
		// 직접 자바 클래스(Config Class) 패키지를 전달
		private static void testAppConfig02() {
			ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");
			User user = ac.getBean(User.class);
			System.out.println(user);
		}
}
