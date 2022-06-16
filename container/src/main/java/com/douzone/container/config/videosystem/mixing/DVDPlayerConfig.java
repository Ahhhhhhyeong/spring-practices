package com.douzone.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


/**
 * 									 import
 *	JavaConfig2(DVDPlayerConfig)	<------- JavaConfig1(DVDConfig) 
 *
 *	JavaConfig2 + JavaConfig1
 */
@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	@Bean
	public DVDPlayer dvdPlayer01(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
