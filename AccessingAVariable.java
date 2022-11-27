package com.variables;

public class AccessingAVariable {
	
	int a = 100 , b=300; //Instance Variable
	
	//if the area is same then direct access can be done for example instance area , instance method
	//if the area is different then access using object reference Ex : instance variable , static are

	public static void main(String[] args) { //Static Method
		AccessingAVariable objKK =new AccessingAVariable(); //Static Area
		System.out.println(objKK.a);
		System.out.println(objKK.b);
		objKK.m1();
	}

 void m1(){ //Instance Method , m1 is user defined method we must call this method in the main method
	 //JVM responsible to execute what is there in the main method	 
		
	 System.out.println(a+b); //Instance Area
	 
	}
}
