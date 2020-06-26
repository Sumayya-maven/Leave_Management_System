package com.jkt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Leaves_Type {
	@Id
	@SequenceGenerator(name = "gen",initialValue = 100)
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "gen" )
	private int lid;
	private String lname;
	private int max_count;
	
	public Leaves_Type()
	{
		
	}
	public Leaves_Type(int lid, String lname, int max_count) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.max_count = max_count;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMax_count() {
		return max_count;
	}
	public void setMax_count(int max_count) {
		this.max_count = max_count;
	}
	@Override
	public String toString() {
		return "Leaves_Type [lid=" + lid + ", lname=" + lname + ", max_count=" + max_count + "]";
	}
	
	
	
}
