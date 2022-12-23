package com.linecomparison;

import java.util.Scanner;

public class LineComparison extends LineFormula {
  void welcome() {
	 System.out.println(" *************** Welcome to Line Comparison Computation *************** ");
 }
  void scannerMethod() {
	  LineFormula lineFormula =new LineFormula();
	  Scanner sc= new Scanner(System.in);
      System.out.println("Enter Value of X1 ::-");
      double x1=sc.nextDouble();
      System.out.println("Enter Value of X2 ::-");
      double x2=sc.nextDouble();
      System.out.println("Enter Value of Y1 ::-");
      double y1=sc.nextDouble();
      System.out.println("Enter Value of Y2 ::-");
      double y2=sc.nextDouble();
      lineFormula.userInput(x1, x2, y1, y2);
      System.out.println("Length of the line is "+lineFormula.userInput(x1, x2, y1, y2));
      
  }
 
}
