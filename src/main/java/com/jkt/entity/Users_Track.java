package com.jkt.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Users_Track {
    @Id
    @SequenceGenerator(name = "gen",initialValue = 1)
	@GeneratedValue(strategy = GenerationType.AUTO ,generator = "gen" )
	private int id;
	private Users username;
	private Leaves_Type lid;
	private int taken;
	
	public Users_Track()
	{
		
	}
	
	public Users_Track(int id, Users username, Leaves_Type lid, int taken) {
		super();
		this.id = id;
		this.username = username;
		this.lid = lid;
		this.taken = taken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsername() {
		return username;
	}

	public void setUsername(Users username) {
		this.username = username;
	}

	public Leaves_Type getLid() {
		return lid;
	}

	public void setLid(Leaves_Type lid) {
		this.lid = lid;
	}

	public int getTaken() {
		return taken;
	}

	public void setTaken(int taken) {
		this.taken = taken;
	}

	@Override
	public String toString() {
		return "Users_Track [id=" + id + ", username=" + username + ", lid=" + lid + ", taken=" + taken + "]";
	}
	
	
	
}
