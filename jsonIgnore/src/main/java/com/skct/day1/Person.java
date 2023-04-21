package com.skct.day1;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	int pid;
	String pname;
	@JsonIgnore
	String age;
	public Person(int pid, String pname, String age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}
	

}
