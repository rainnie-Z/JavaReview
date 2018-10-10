package com.rainnie.homework8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.rainnie.homework5.Person;

public class ProductTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//write();
		read();
	}

	public static void read() throws FileNotFoundException, IOException {
		 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("product.txt"));
		 try {
			/*ArrayList list=(ArrayList) ois.readObject();
			Iterator it=list.iterator();
			while(it.hasNext()) {
				Product p=(Product) it.next();
				if(p.getPrice()>1500) {
					System.out.println(p);
				}
				
			}*/
			 
			 Product p;
			while((p=(Product)ois.readObject())!=null) {
				System.out.println(p.toString());
			}
			 
			ois.close();
			 
		} catch (Exception e) {
			 
			 
		}
		 
		
	}

	public static void write() throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("product.txt")); 
		Scanner sc=new Scanner(System.in);//
		/*ArrayList<Product> al = new ArrayList();
		al.add(new Product());
		al.add(new Product());
		al.add(new Product());*/
		for(int i=0;i<3;i++) {
			/*Product p = al.get(i);*/
			Product p=new Product();
			System.out.println("请输入商品id:");
			sc=new Scanner(System.in);
			String id=sc.nextLine();
			p.setId(id);
			System.out.println("请输入商品名称:");
			sc=new Scanner(System.in);
			String name=sc.nextLine();
			p.setName(name);
			System.out.println("请输入商品价格:");
			sc=new Scanner(System.in);
			Double price=sc.nextDouble();
			p.setPrice(price);
			oos.writeObject(p);
			 
		}
		/*oos.writeObject(al);*/
		oos.close();
		 

		
		
			
			 
		
	}
}

class Product implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Double price;
	
	public Product() {
		 
	}
	public Product(String id, String name,  Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  Double getPrice() {
		return price;
	}
	public void setPrice( Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}