package com.sunguanjun.pojo;

public class Hobby {
	private int id;
	
	private int userID;
	
	private String hobby;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Hobby [id=" + id + ", userID=" + userID + ", hobby=" + hobby
				+ "]";
	}
	
	
}
