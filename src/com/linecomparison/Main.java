package com.linecomparison;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      LineComparison lineComparison =new LineComparison();
      lineComparison.welcome();
      System.out.println("Enter Line 'A' co-ordinator's ");
      double lineA=lineComparison.scannerMethod();
      System.out.println("Enter Line 'B' co-ordinator's ");
      double lineB=lineComparison.scannerMethod();
      if(lineA==lineB)
      {
    	  System.out.println("Line A and Line B are Equal");
      }
      else {
    	  System.out.println("Line A and Line B are Not Equal");
      }
      
	}

}
