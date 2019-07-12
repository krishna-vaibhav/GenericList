package com.yash.projectdemo.domain;

public class Person {
 int pId;
 String pName;
 String pJob;
 long pSal;
 
 public Person() {
	// TODO Auto-generated constructor stub
}
 
 
 
public Person(int pId, String pName, String pJob, long pSal) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pJob = pJob;
	this.pSal = pSal;
}



public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpJob() {
	return pJob;
}
public void setpJob(String pJob) {
	this.pJob = pJob;
}
public long getpSal() {
	return pSal;
}
public void setpSal(long pSal) {
	this.pSal = pSal;
}


}
