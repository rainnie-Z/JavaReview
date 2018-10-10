package com.rainnie.set;

public class Student implements Comparable{
	private final int id;
	private String name;
	private int age;
	

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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


	public int getId() {
		return id;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s=(Student) o; 
		/*return this.id-s.id;*/
		return s.id-this.id;
	}
	/*public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Student) {
			if(this.id==((Student)o).id) {
				flag=true;
			}
		}
		return flag;
		
	}*/

}
