package com.rainnie.homework2;

public class Person {
	private Integer id;
	private String username;
	private String password;
	
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void showInfo() {
		System.out.println("用户编号:"+id+" 用户名:"+username+" 密码:"+password);
	}
}
