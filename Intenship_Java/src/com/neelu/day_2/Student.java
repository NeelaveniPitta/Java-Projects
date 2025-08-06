package com.neelu.day_2;

public class Student {

	private Long id;
	private String name;
	private double marks;
	
	public Student(Long id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}

