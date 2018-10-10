package com.rainnie.homework4;

public class EmployeeTest {
	public static void main(String[] args) {
		/*Emplyoee e=new Accountant();
		e.setName("王五");
		e.setAge(33);
		e.setJob("会计");
		System.out.println("员工姓名:"+e.getName());
		System.out.println("年龄:"+e.getAge()+"岁");
		System.out.println("工种:"+e.getJob());
		e.work();
		Accountant a=(Accountant)e;
		System.out.println("公司全体员工实收工资总额"+a.cal(125000)+"元");*/
		Emplyoee e=new Accountant();
		Accountant at=(Accountant) e;
		at.setName("王五");
		at.setAge(33);
		at.setJob("会计");
		at.setAmount(125000);
		
		System.out.println("员工姓名:"+at.getName());
		System.out.println("年龄:"+at.getAge()+"岁");
		System.out.println("工种:"+at.getJob());
		at.work();
		System.out.println("公司全体员工实收工资总额"+at.cal(125000)+"元");
	}
}
abstract class Emplyoee{
	private String name;
	private int age;
	private String job;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public abstract void work();
}
class Accountant extends Emplyoee{
	private int amount;
	
	/*public int getAmount() {
		return amount;
	}*/
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public void work() {
		System.out.println("正在计算工资");
	}
	public int cal(int money) {
		return (int) (money*(1-0.1));
		
	}
	
}
