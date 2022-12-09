package com.DAOAjax;

public class Teacher {
	
	private int teacherid;
	private String fname;
	private String lname;
	private String gender;
	private String address;
	private String city;
	private String pin;
	private String mobileno;
	private String qualification;
	private String designation;
	private String specialization;
	private String birthdate;
	private String joiningdate;
	private String currentstatus;
	
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String bithdate) {
		this.birthdate = bithdate;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getCurrentstatus() {
		return currentstatus;
	}
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
	public Teacher() {
	}
	public Teacher(int teacherid, String fname, String lname, String gender, String address, String city, String pin,
			String mobileno, String qualification, String designation, String specialization, String birthdate,
			String joiningdate, String currentstatus) {
		this.teacherid = teacherid;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.pin = pin;
		this.mobileno = mobileno;
		this.qualification = qualification;
		this.designation = designation;
		this.specialization = specialization;
		this.birthdate = birthdate;
		this.joiningdate = joiningdate;
		this.currentstatus = currentstatus;
	}
	
	
	
}
