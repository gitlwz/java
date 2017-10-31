package cn.itcast.copy;

import java.io.Serializable;

class Address{
	
	String city;
		
	public Address(String city){
		this.city = city;
	}
	
}

public class Person implements Cloneable{
	int id;
	
	String name;
	
	Address address;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "±‡∫≈£∫"+ this.id+" –’√˚£∫"+ this.name +" µÿ÷∑£∫"+ address.city;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
