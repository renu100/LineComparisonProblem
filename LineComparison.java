package com.lineComparisons;

import java.util.Scanner;

class Calculation {

	public static double calculate(double x1, double y1, double x2, double y2) {
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return dist;
	}
}

class Compare {
	public static void compare(String line1, String line2) {
		int compare = line1.compareTo(line2);
		if (compare == 0) {
			System.out.println("Line1 or Line2 is Equal");
		} else if (compare >= 1) {
			System.out.println("Line1 Greater then Line2 ");
		} else {
			System.out.println("line1 Smaller then Line2 ");
		}
	}
}

public class LineComparison {

	// Method Creation
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 = ");
		double x1 = scan.nextDouble();
		System.out.println("Enter y1 = ");
		double y1 = scan.nextDouble();
		System.out.println("Enter x2 = ");
		double x2 = scan.nextDouble();
		System.out.println("Enter y2 = ");
		double y2 = scan.nextDouble();
		System.out.println("Enter x3 = ");
		double x3 = scan.nextDouble();
		System.out.println("Enter y3 = ");
		double y3 = scan.nextDouble();
		System.out.println("Enter x4 = ");
		double x4 = scan.nextDouble();
		System.out.println("Enter y4 = ");
		double y4 = scan.nextDouble();
		double dist = Calculation.calculate(x1, y1, x2, y2);
		double dist1 = Calculation.calculate(x3, y3, x4, y4);

		String line1 = Double.toString(dist);
		String line2 = Double.toString(dist1);
		Boolean equal = line1.equals(line2);
		Compare.compare(line1, line2);
	}

	public static void main(String[] args) {
		// Objection Creation
		LineComparison lineComparison = new LineComparison();
		lineComparison.input();
	}

}
