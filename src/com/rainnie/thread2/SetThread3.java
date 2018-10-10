package com.rainnie.thread2;
/*
 * 生产者
 *    先看是否有数据，有就等待，没有就生成，生成完了之后通知消费者消费数据
 * 
 */
public class SetThread3 implements Runnable{
	private Student s;
	int i=0;
	public SetThread3(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (s) {
				//这是有应该判断有没有
				if(s.flag) {
					try {
						s.wait();//有就等待
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(i%2==0) {
					s.name="司马老贼";
					s.age=20;
				}else {
					s.name="Doinb";
				    s.age=25;
				}
				i++;
				//如果生产了，就是有数据，这时候应该修改标记
				s.flag=true;
				//然后唤醒线程
				s.notify();
			}
		}
		
	}
	 
	
}
