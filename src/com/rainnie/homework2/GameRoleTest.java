package com.rainnie.homework2;
/**
 * @功能:创建一个游戏角色类(GameRole) 
                该类中存放游戏名称(name),游戏账号(id),游戏密码(password),角色等级(level),角色状态(status)等信息
 * @author Rainnie
 * @时间:2018/7/10
 */
public class GameRoleTest {
	public static void main(String[] args) {
		GameRole gr=new GameRole();
		gr.setName("王者荣耀");
		gr.setId("狄仁杰1001");
		gr.setPassword("ok1234");
		gr.setLevel(20);
		gr.setStatus(true);
		gr.showinfo();
	}
}
