package com.lineComparisons;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
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
		// calculating distane
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double dist1 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		String line1 = Double.toString(dist);
		String line2 = Double.toString(dist1);
		Boolean equal = line1.equals(line2);
		int compare = line1.compareTo(line2);

		if (compare == 0) {
			System.out.println("Equal");
		} else if (compare >= 1) {
			System.out.println("Line1 Greater then Line2 ");
		} else {
			System.out.println("line1 Smaller then Line2 ");
		}
	}
}