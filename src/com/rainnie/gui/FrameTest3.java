package com.rainnie.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件。
 * A：创建窗体对象
 * B:创建按钮对象
 * C:把按钮添加到窗体
 * D:窗体显示
 */
public class FrameTest3 {
	public static void main(String[] args) {
		JFrame f=new JFrame("添加按钮");
		f.setBounds(400, 200, 400, 300);
		// 设置布局为流式布局
		f.setLayout(new FlowLayout());
		
		JButton btn=new JButton("点我啊");
		f.add(btn);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你再点试试");
				
			}
		});
		f.setVisible(true);
	}
}
