package com.iamyasas.java8.streams;

import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private List<String> skills;
	
	Employee(String name, int age, List<String> skills) {
		super();
		this.name = name;
		this.age = age;
		this.skills = skills;
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
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
}
