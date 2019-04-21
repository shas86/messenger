package org.shas.rest.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	long id;
	String message;
	String author;
	Date d;
    public Message() {}
    public Message(long id,String message,String author) {
    	this.id=id;this.message=message;this.author=author;this.d=new Date();
    	
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}

}
