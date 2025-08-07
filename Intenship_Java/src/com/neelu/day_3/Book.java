package com.neelu.day_3;

public class Book {

	private int id;
	private String title;
	private String author;
	private boolean isIssued;
	
	public Book(int id, String title, boolean isIssued) {
		super();
		this.id = id;
		this.title = title;
		this.isIssued = isIssued;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isIssued=" + isIssued + "]";
	}
	
}
