package com.rainnie.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest2 {
	public static void main(String[] args) {
		Frame f=new Frame();
		f.setBounds(400, 200, 400, 300);
		//用适配器类改进
			/*	f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});*/
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
				// 设置窗体可见
		f.setVisible(true);
	}
}
