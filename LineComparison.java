package com.lineComparisons;

public class LineComparison {
	void line1(double x1, double x2, double y1, double y2) {
		double value = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(value);
	}

	public static void main(String[] args) {
		LineComparison lineComparison = new LineComparison();
		lineComparison.line1(5, 10, 5, 0);

	}
}