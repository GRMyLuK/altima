package com.videogame.collection.entity;

import java.io.Serializable;
import java.util.Date;

public class VideoGame implements Serializable {
	private static final long serialVersionUID = -5477799701040195544L;
	
	private String name;
	private Date releaseDate;
	private String publisher;
	private Console console;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}

	public String toString() {
		return "VideoGame [name=" + name + ", releaseDate=" + releaseDate + ", publisher=" + publisher + ", console="
				+ console + "]";
	}
	
}
