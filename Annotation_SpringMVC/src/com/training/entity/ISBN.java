package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class ISBN {

	
	private int group;
	private int publisher;
	private int title;
	public ISBN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ISBN(int group, int publisher, int title) {
		super();
		this.group = group;
		this.publisher = publisher;
		this.title = title;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getPublisher() {
		return publisher;
	}
	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "ISBN : " + group + "-" + publisher + "-" + title ;
	}
	
	
}
