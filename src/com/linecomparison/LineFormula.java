package com.linecomparison;

public class LineFormula {
	double userInput(double x1, double x2, double y1, double y2) {
		  double lineLength=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return lineLength;
	  }

}
