/*Author : Kavya K 
 Student Id : AF0232777
Date  : 24-10-2022
Aim : Programs on Logical operators */

package JavaExamples;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int value=10;
		 
		    //Incrementing
			System.out.println("Post Increment: " +value++); //10 then increments so value=10+1=11
			System.out.println("Pre Increment: "+(++value)); //12 , value=12
			
			// Decrementing
			System.out.println("Post Decrement: " +value--); //12 , value=11
			System.out.println("Pre Decrement: "+(--value)); //10 , value=10


	}

}
