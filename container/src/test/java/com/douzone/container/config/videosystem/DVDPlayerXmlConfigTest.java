package com.douzone.container.config.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.douzone.container.videosystem.DVDPack;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:com/douzone/container/config/videosystem/DVDPlayerConfig.xml")
public class DVDPlayerXmlConfigTest {
	// 예외 발생
	// XML Bean(Avengers) 설정에서는 id를 자동으로 부여 하지 않는다.
	// 따라서 @Qualifier를 사용할 수 없음
	// @Autowired
	private DigitalVideoDisc dvd1;

	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;

	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;

	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengersAgeofUltron")
	private DigitalVideoDisc dvd5;

	@Autowired
	@Qualifier("avengersCaptainAmerica")
	private DigitalVideoDisc dvd6;

	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;

	@Autowired
	private DVDPack dvdPack;
	
	@Autowired
	@Qualifier("avengersExpansionEdition")
	private DigitalVideoDisc dvd8;
	
	
	@Autowired
	@Qualifier("avengersExpansionEdition2")
	private DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersExpansionEdition3")
	private DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("dvdPlayer1")
	private DVDPlayer dvdPlayer1;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer dvdPlayer2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer dvdPlayer3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer dvdPlayer4;
	
	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer dvdPlayer5;

	
	/***************************************/

	@Disabled
	@Test
	public void testDVD() {
		assertNotNull(dvd1);
	}

	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}

	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}

	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}

	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}

	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}

	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
	}

	@Test
	public void testDVDPack1() {
		assertNotNull(dvdPack);
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
	}

	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
	}

	@Test
	public void testDVDPlayer() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer1);
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer2);
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer3);
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer4);
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer5);
	}
} 