package com.yash.projectdemo.domain;

public class Address {
 int aid;
 String pindcode;
 String street;

public Address() {
	// TODO Auto-generated constructor stub
}
 
public Address(int aid, String pindcode, String street) {
	super();
	this.aid = aid;
	this.pindcode = pindcode;
	this.street = street;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getPindcode() {
	return pindcode;
}
public void setPindcode(String pindcode) {
	this.pindcode = pindcode;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}



}
