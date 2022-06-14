package com.douzone.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.douzone.container.user.User1;

public class XmlConfigTest {

	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		// testBeanFactory01();
		
		// XML Bean Configuration(Explicit Configuration)
		// testBeanFactory02();
	}
	
	// XML Auto Configuration(Annotation Scanning)
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/douzone/container/config/user/applicationContext01.xml"));
		
		User1 user1 = bf.getBean(User1.class);
		System.out.println(user1.getName());
		
		// Bean Id가 자동으로 설정됨 
		user1 = (User1)bf.getBean("user1");
		System.out.println(user1.getName());
	}
	
	// XML Bean Configuration(Explicit Configuration)
	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/douzone/container/config/user/applicationContext02.xml"));
		
		User1 user1 = bf.getBean(User1.class);
		System.out.println(user1.getName());
		
		// Bean Id가 자동으로 설정 안됨
//		user1 = (User1)bf.getBean("user1");
//		System.out.println(user1.getName());
	}
}
