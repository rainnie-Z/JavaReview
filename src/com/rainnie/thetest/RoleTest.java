package com.rainnie.thetest;
/*
 * @功能:定义一个抽象的"Role"类 有姓名 年龄 性别等成员变量,以及它的子类Employee和孙子类manager
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
public class RoleTest {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empid="1001";
		e.setSalary("10000");
		e.setName("Smlz");
		e.setAge(21);
		e.setSex("男");
		e.sing();
		e.display();
		
		Employee m=new Manager();
		m.empid="1002";
		m.setSalary("20000");
		m.setName("小申");
		m.setAge(35);
		m.setSex("男");
		m.display();
		
		
	}
}
/*
 * Role类
 */
abstract class Role{
	private String name;//姓名
	private int age;//年龄
	private String sex;//性别
	
	public Role() {
		 
	}
	public Role(String name) {
		 this.name=name;
	}
	public Role(String name, int age, String sex) {
		this(name);
		this.age = age;
		this.sex = sex;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	//抽象的play()方法
	abstract void display();
	
}

/*
 * Employee类
 */
class Employee extends Role{
	//salary成员变量
	private String salary;
	//静态成员变量 id
	public static String empid;
	
	public Employee() {
	}
	public Employee(String name,int age,String sex) {
		super(name,age,sex);
		 
	}
	public Employee(String name,int age,String sex,String salary) {
		super(name,age,sex);
		this.salary = salary;
	}
	


	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary =salary;
	}
	//覆盖父类play()方法
	@Override
	public void display() {
		 System.out.println("emid:"+empid+",salary:"+salary+",name:"+getName()+",age:"+getAge()+",sex:"+getSex());
	}
	//final sing()方法
	final void sing() {
		System.out.println("Employee sing");
	}
}

/*
 * Manager类
 */
class Manager extends Employee{
	//final成员变量"vehicle"
	final String vehicle="car";
	
	public Manager() {
		 
	}

	public Manager(String name, int age, String sex, String salary) {
		super(name, age, sex, salary);
		 
	}
	
	public void display() {
		System.out.println("empid"+empid+",salary:"+getSalary()+",name:"+getName()+",age:"+getAge()+",sex:"+getSex()+",vehicle:"+vehicle);
	}
	
}
