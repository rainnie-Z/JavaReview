package com.rainnie.net2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 * java.net.ConnectException: Connection refused: connect
 */
public class ClientTest {
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("192.168.20.24", 8888);
		OutputStream os=s.getOutputStream();
		os.write("hello,tcp,我来了".getBytes());
		s.close();
	}
}
