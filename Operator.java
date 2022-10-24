/*Author : Kavya K 
 Student Id : AF0232777
Date  : 24-10-2022
Aim : Programs on operators */

package JavaExamples;

public class Operator {

	public static void main(String[] args) {
		
		//Local Variable 
		int add, sub, mul, div, mod;
		
	    int num1= 10, num2 = 2;
	    
	    add = num1 + num2;
	    
	    sub = num1 - num2;
	    
	    mul = num1 * num2;
	    
	    div = num1 / num2;
	    
	    mod = num1 % num2;
	    
	    System.out.println("Addition of " + num1 + " and " +num2 + " is " + add);
	    System.out.println("Subtraction of " + num1 + " and " +num2 + " is " + sub);
	    System.out.println("Multiplication of " + num1 + " and " +num2 + " is " +mul);
	    System.out.println("Division of " + num1 + " and " +num2 + " is " + div);
	    System.out.println("Modulus of " + num1 + " and " +num2 + " is " +mod);
	}
}

