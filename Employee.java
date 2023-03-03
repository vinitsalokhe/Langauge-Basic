package com.array.exercise;

public class Employee {
	int id;
	String name;
	String address;

	public Employee() {

	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.id = 10;
		e1.name = "ram";
		e1.address = "abcd";
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.address);

		Employee e2 = new Employee();
		e2.id = 20;
		e2.name = "sham";
		e2.address = "pqrs";
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.address);

		Employee e3 = new Employee(30, "jonh", "pune");
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.address);
		System.out.println(e3.id + " " + " " + e3.name + " " + " " + e3.address);

		System.out.println("/n");
		int a = 10;
		int b = 20;
		boolean res = !(a < b);
		System.out.println(res);

		int n = 10;
		int m = 20;

		++n;
		System.out.println(n);
		n++;
		System.out.println(n);

	}
}
