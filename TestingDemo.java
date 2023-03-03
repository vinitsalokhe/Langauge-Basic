package com.array.exercise;

public class TestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp();

		e1.id = 10;
		e1.name = "Ram";

		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.country);

		/*
		 * e1.id=500; e1.name="Madan";
		 * 
		 * System.out.println(e1.id); System.out.println(e1.name);
		 * System.out.println(e1.country);
		 */
		Emp e2 = new Emp();

		e2.id = 20;
		e2.name = "Pream";

		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.country);

		e2 = e1;
		System.out.println("********************");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.country);

	}

}
