package com.videogame.collection.entity;

import java.io.Serializable;
import java.util.Date;

public class Console implements Serializable {
	private static final long serialVersionUID = 2196631190656719260L;
	
	private String name;
	private Date releaseDate;
	private String manufacturer;
	private Integer bitsNumber;
	
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getBitsNumber() {
		return bitsNumber;
	}
	public void setBitsNumber(Integer bitsNumber) {
		this.bitsNumber = bitsNumber;
	}

	public String toString() {
		return "Console [name=" + name + ", releaseDate=" + releaseDate + ", manufacturer=" + manufacturer
				+ ", bitsNumber=" + bitsNumber + "]";
	}
	
}
