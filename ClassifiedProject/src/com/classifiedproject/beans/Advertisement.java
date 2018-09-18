package com.classifiedproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Advertisement {

	private int id;
	private String description;
	@Autowired
	private Contact contact;
	
	public Advertisement() {
		System.out.println("Advertisement Bean");
	}
	
	public Advertisement(int id, String description, Contact contact) {
		super();
		this.id = id;
		this.description = description;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
