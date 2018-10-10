package com.rainnie.homework2;

public class GameRole {
	private String name;
	private String id;
	private String password;
	private Integer level;
	private boolean status;
	public GameRole() {}
	public GameRole(String name, String id, String password, int level, boolean status) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.level = level;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void showinfo() {
		System.out.println("我在"+name+"里面的游戏账号是"+id+",游戏密码是"+password+",等级是"+level+",游戏状态是"+status);
	}
	
	
}
