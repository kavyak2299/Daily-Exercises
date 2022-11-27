package com.variables;

public class StaticVariable {
	//static variable declared inside the class , outside the method with the static modifier
	//memory allocated when the .class file is loaded , non heap memory
	//scope : accessible within the class	
	//static variables can be accessed using the class name irrespective of the area
	
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
	System.out.println(StaticVariable.a);
	System.out.println(StaticVariable.b);
	StaticVariable obj = new StaticVariable();
	obj.m1();

	}
	void m1()
	{
		System.out.println(StaticVariable.a);
		System.out.println(StaticVariable.b);
	}
	

}
