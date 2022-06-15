package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {
	@Autowired
	private DigitalVideoDisc dvd;
	
	// 같은 타입의 bean이 2개 이상 존재하는 경우2
	// 설정 클래스의 빈 생성 메소드의 이름
	@Qualifier("dvdPlayer01")
	@Autowired
	private DVDPlayer dvdPlayer01;
	
	
	// 같은 타입의 bean이 2개 이상 존재하는 경우2
	// 설정 클래스의 빈 생성 메소드의 @Bean의 name 속성을 사용하는 방법	
	@Qualifier("dvdPlayer02")
	@Autowired
	private DVDPlayer dvdPlayer02;
	
	@Qualifier("dvdPlayer03")
	@Autowired
	private DVDPlayer dvdPlayer03;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotNull01() {
		assertNotNull(dvdPlayer01);
	}
	
	@Test
	public void testDVDPlayerNotNull02() {
		assertNotNull(dvdPlayer02);
	}
	
	@Test
	public void testDVDPlayerNotNull03() {
		assertNotNull(dvdPlayer03);
	}
	
	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer01.play());
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer02.play());
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer03.play());
	}
	
	
	
	
}
