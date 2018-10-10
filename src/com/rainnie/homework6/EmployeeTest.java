package com.rainnie.homework6;

import java.util.Iterator;
import java.util.TreeSet;

import com.rainnie.set.Student;

public class EmployeeTest {
	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>();
		
		Employee e1=new Employee("张三","1002",7000);
		Employee e2=new Employee("李四","1012",4000);
		Employee e3=new Employee("王五","1001",2000);
		Employee e4=new Employee("赵六","1008",6000);
		Employee e5=new Employee("陈七","1005",9000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
	   Iterator<Employee> it=ts.iterator();
	   while(it.hasNext()) {
		   Employee s=it.next();
		   System.out.println(s.getName()+"-"+s.getEmpno()+"-"+s.getSalay());
	   }
		
	}
}
