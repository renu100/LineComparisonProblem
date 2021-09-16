package com.lineComparisons;

public class LineComparison {
	public static void main(String[] args) {
		double x1 = 5, y1 = 5, x2 = 5, y2 = 0, x3 = 5, y3 = 9, x4 = 8, y4 = 0;
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));//line 1 distance
		double dist1 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));//line 2 distance
		String line1 = Double.toString(dist);
		String line2 = Double.toString(dist1);
		Boolean equal = line1.equals(line2);
		System.out.println(line1);
		System.out.println(line2);
		if (equal == true) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}