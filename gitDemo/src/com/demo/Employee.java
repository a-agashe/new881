package com.demo;

public class Employee {
	private String name;
	private String address;
	private int salary;
	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
