package com.rainnie.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 如果一个类没有构造方法：
 * A:成员全部是静态的(Math,Arrays,Collections)
 * B:单例设计模式(Runtime)
 * C:类中有静态方法返回该类的对象(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 
 * 看InetAddress的成员方法：
 * public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 */
public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress address = InetAddress.getByName("K660D");
		InetAddress address = InetAddress.getByName("192.168.20.24");
		
		String name=address.getHostName();//K660D
		String ip=address.getHostAddress();//192.168.20.78
		System.out.println(name+"---"+ip);
		
	}
}
