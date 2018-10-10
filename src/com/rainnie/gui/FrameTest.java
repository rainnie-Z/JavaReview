package com.rainnie.gui;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame f=new Frame("窗体对象的名字");
		f.setTitle("窗体标题");//会覆盖上面的“窗体对象的名字”
		/*f.setSize(400, 300);
		f.setLocation(400, 200);*/
		f.setBounds(400, 200, 400, 300);//等同上面两个
		f.setVisible(true);
	}
}
