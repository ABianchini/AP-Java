package period.one;

import java.util.Scanner;

public class CalcGyro {
	public double angle;
	public double angleVel;
	Scanner in = new Scanner(System.in);
	
	public CalcGyro() {
	}
	public void runAngleCalc() {
		System.out.println("Enter the velocity of the Angle:");
		double inputVel = in.nextDouble();
		angleVel = inputVel;
		angle = 0;
		angle = angle + (0.1 * angleVel);	
	}
	public double getAngle() {
		return angle;
	}
}