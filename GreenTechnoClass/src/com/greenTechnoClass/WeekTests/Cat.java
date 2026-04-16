package com.greenTechnoClass.WeekTests;

public class Cat implements Animal {

	private int age = 0;
	private String name = null;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("mamal");
		
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(3);
		c.setName("Mehanth");
		System.out.println("Name " + c.getName());
		System.out.println("Age "+c.getAge());
	}

}
