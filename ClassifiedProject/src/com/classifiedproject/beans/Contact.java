package com.classifiedproject.beans;

import org.springframework.stereotype.Component;

@Component
public class Contact {
private String username;
private String emailid;
private String mobile;

public Contact() {
	System.out.println("Contact Accessed");
}



public Contact(String username, String emailid, String mobile) {
	super();
	this.username = username;
	this.emailid = emailid;
	this.mobile = mobile;
}



public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}


}
