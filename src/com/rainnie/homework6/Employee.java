package com.rainnie.homework6;

public class Employee implements Comparable<Employee>{
	private String name;
	private String empno;
	private int salay;
	public Employee() {
		super();
	}
	public Employee(String name, String empno, int salay) {
		super();
		this.name = name;
		this.empno = empno;
		this.salay = salay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	@Override
	public int compareTo(Employee e) {
		int num=e.salay-this.salay;
		return num;
	}
	
}
