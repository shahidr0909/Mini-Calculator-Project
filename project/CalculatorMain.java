package com.calculater.project;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args)
	{
		AddNumber addobj = new AddNumber();
		SubstractNumber Subobj = new SubstractNumber();
        MultiplyNumber multobj = new MultiplyNumber();
		DivideNumber divobj = new DivideNumber();
		
		System.out.println("Mini alculator");
		System.out.println(".........***********..........");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add of two Number");
		System.out.println("2. Add of three Number");
		System.out.println("3. Substract Number");
		System.out.println("4. Multiplay of two Number");
		System.out.println("5. Multiplay of three Number");
		System.out.println("6. Divide Number");
		String calculationType = sc.next();
	
		int a = 0;
		int b = 0;
		int c = 0;
		
			if  (calculationType.equals("1") || calculationType.equals("3") || calculationType.equals("4") || calculationType.equals("6")) {
		    System.out.println("Enter of Number a");
		    a = sc.nextInt();
		    System.out.println("Enter of Number b");
		    b = sc.nextInt();
	}
	
		    else 
		    {
		    	System.out.println("Enter of Number a");
				 a = sc.nextInt();
				System.out.println("Enter of Number b");
				 b = sc.nextInt();
				System.out.println("Enter of Number c");
			    c = sc.nextInt();
		    }
		    
			try {
				switch (calculationType){
				   case "1":
					System.out.println("Addition equal to: " + addobj.calculate(a, b));
					break;
				   case "2":
					   System.out.println("Addition equal to: " + addobj.calculate(a, b, c));
					   break;
				   case "3":
					   System.out.println("Subtraction equal to: " + Subobj.calculate(a, b));
					   break;
				   case "4":
					   System.out.println("Multiplication equal to:" + multobj.calculate(a, b));
					   break;
				   case "5":
					   System.out.println("Multiplication equal to:" + multobj.calculate(a, b, c));
					   break;
				   case "6":
					   System.out.println("Division equal to:" + divobj.calculate(a, b));
					   
				}
			} catch (ArithmeticException e) {
				System.out.println("You divided by entered Wrong Number");
			}
			
		
		
		

	}

}
