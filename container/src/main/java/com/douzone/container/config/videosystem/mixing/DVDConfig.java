package com.douzone.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
}
