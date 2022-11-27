package com.variables;

public class LocalVariable {

	public static void main(String[] args) { //static method
		
		//memory allocated when method is started , deleted when method is completed
		//scope : accessible within the method		
		
		int a=10; //declared inside the method so it is a local variable
		
		System.out.println(a); //valid

	}
	void m1() { //instance method
		
		//System.out.println(a); //invalid . you cannot access outside the method
	}

}
