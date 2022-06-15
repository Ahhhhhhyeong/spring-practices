package com.douzone.container.videosystem;

public class IronMan implements DigitalVideoDisc {
	private String title = "IronMan";
	private String studio = "MARVEL";
	
	@Override
	public String play() {		
		return "Playing Movie " + studio + "'s " + title;
	}

}
