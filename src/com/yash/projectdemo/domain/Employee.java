package com.yash.projectdemo.domain;

public class Employee {
 int id;
 String name;
 long mobile_number;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, int mobile_number) {
	super();
	this.id = id;
	this.name = name;
	this.mobile_number = mobile_number;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public long getMobile_number() {
	return mobile_number;
}

public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}



}
