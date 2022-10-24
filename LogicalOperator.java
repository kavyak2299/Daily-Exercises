/*Author : Kavya K 
 Student Id : AF0232777
Date  : 24-10-2022
Aim : Programs on Logical operators */

package JavaExamples;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int val;
		
		Scanner scObj = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		val=scObj.nextInt();
		
		scObj.close();
		
		//AND operator
		
		if((val>=10)&&(val%2==0))
			
			System.out.println("Value is greater than 10 and also an even number");
		
		else
			
			System.out.println("Condition not met ");
		
		//OR Operator
		
		if((val>=10)||(val%2==0))
		
			System.out.println("Either of the condition is true or both is true");
		
		else
			
			System.out.println("Conditions not met ");
		

	}

}

