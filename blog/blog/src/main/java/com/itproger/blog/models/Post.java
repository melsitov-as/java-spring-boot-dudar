package com.itproger.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// Модель создаст новую таблицу в бд, если такой таблицы не существует
@Entity
public class Post {
	
	@Id
	// эта аннотация позволит нам при добавлении новой записи каждый раз генерировать новое значение
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title, anons, full_text;
	private int views;
	
	
	
	
	public Post(String title, String anons, String full_text) {
		super();
		this.title = title;
		this.anons = anons;
		this.full_text = full_text;
	}
	
	
	public Post() {
		super();
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
	public String getAnons() {
		return anons;
	}
	public void setAnons(String anons) {
		this.anons = anons;
	}
	public String getFull_text() {
		return full_text;
	}
	public void setFull_text(String full_text) {
		this.full_text = full_text;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	

}
