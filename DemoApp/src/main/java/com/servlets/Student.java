package com.servlets;

public class Student {
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	int rollno;
	String name;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}
