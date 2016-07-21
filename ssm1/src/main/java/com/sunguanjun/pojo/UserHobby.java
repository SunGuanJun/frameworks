package com.sunguanjun.pojo;

public class UserHobby {
	private Integer id;

    private String userName;
    
    private String hobbyName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
    
	public String toString(){
		return "UserHobby:[" + this.id + ", " + this.userName + ", " + this.hobbyName + "].";
	}
}
