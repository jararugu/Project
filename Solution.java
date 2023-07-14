package com;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
	System.out.println("welcome to Calculator Project");
	System.out.println("--------------------------");
	
	Calculator calc = new CalculatorImp1();
	// upcasting to archive abstraction
	while(true) // infinate loop
	{
		Scanner sc =new Scanner(System.in);

		// menu driven program
       System.out.println("1:addition\n2:substraction ");	
       System.out.println("3:multipliction\n4:division");
       System.out.println("5:EXIT\n Enter choice:");
       
       int choice = sc.nextInt();
       
       // local varibles does not have default values
       // so intialized to 0
       int a=0;
       int b=0;
       
       if(choice>=1 && choice<=4)
       {
    	   System.out.println("enter 2 numbers");
    	    a = sc.nextInt();
   		    b= sc.nextInt();
       }
       sc.close();
       
       
       switch(choice)
       {
       case 1: 
    	  	System.out.println("sum of "+a+" "+b+" is: "+calc.add(a,b));
       break;
       case 2: 
   		System.out.println("sum of "+a+" "+b+" is: "+calc.sub(a,b));
       break;
       case 3:  
   		System.out.println("sum of "+a+" "+b+" is: "+calc.mul(a,b));
       break;
       case 4: 
      		System.out.println("sum of "+a+" "+b+" is: "+calc.div(a,b));
       break;
       case 5:
    	    System.out.println("thank you");
    	    System.exit(0);
       default:
    	   System.out.println("invalid choice");
    	   
       } // end of the switch statement
//       sc.close();

	}// end of the while loop
	
		
	} //end of main method
}// end of class
