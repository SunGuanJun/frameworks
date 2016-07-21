package com.sunguanjun.pojo;

import java.util.List;

public class UserHobby2 {
	private Integer id;

    private String userName;
    
    private List<Hobby> hobbies;

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

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "UserHobby2 [id=" + id + ", userName=" + userName + ", hobbies="
				+ hobbies.toString() + "]";
	}
    
    
}
