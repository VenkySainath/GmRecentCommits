package com.gm.commits.data.network.model;

/**
 * Created by ryellap on 4/17/18.
 */



public class Commit{
	private Author author;
	private String message;
	public void setAuthor(Author author){
		this.author = author;
	}
	public Author getAuthor(){
		return author;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getMessage(){
		return message;
	}
	@Override
	public String toString() {
		return "Commit{" +
				", author=" + author +
				", message='" + message + '\'' +
				'}';
	}
}