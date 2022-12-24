package com.linecomparison;

public class Comparison {
 void comparison(double a, double b) {
	 if(a==b)
     {
   	  System.out.println("Line A and Line B are Equal");
     }
	 else if(a>b)
	 {
	   	  System.out.println("Line A is Greater than Line B ");
	 }
	 else if(b>a)
	 {
	   	  System.out.println("Line A is Less than Line B ");
	 }
     else {
   	  System.out.println("Line A and Line B are Not Equal");
     }
     
 }
}
