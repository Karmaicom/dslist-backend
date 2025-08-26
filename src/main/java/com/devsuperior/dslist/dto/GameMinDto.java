package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescrition;

	public GameMinDto() {
	}

	public GameMinDto(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescrition = entity.getShortDescrition();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescrition() {
		return shortDescrition;
	}

	public void setShortDescrition(String shortDescrition) {
		this.shortDescrition = shortDescrition;
	}

}
