package tester;

import java.util.Scanner;

public class Cosine {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Cosine of:");
		double x = in.nextDouble();
		double answer = 1- (x*x)/(2) + (Math.pow(x, 4))/(24) - (Math.pow(x, 6))/(6*5*4*6);
		System.out.println(answer);
	}
}
