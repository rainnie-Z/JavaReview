package com.rainnie.gui;

 

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameTest4 {
	public static void main(String[] args) {
		JFrame jf=new JFrame("数据转移");
		jf.setBounds(400, 200, 400, 300);
		jf.setLayout(new FlowLayout());
		
		final JTextField tf=new JTextField(20);
		JButton jb=new JButton("数据转移");
		final JTextArea jta=new JTextArea(10, 40);
		
		jf.add(tf);
		jf.add(jb);
		jf.add(jta);
		
		jf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值
				String tf_str=tf.getText().trim();
				// 清空数据
				tf.setText("");
				// 追加和换行
				jta.append(tf_str + "\r\n");
				
				//获取光标
				tf.requestFocus();
				
				
			}
		});
		jf.setVisible(true);
	}
}
