package period.one;

public class CalcGyroTester {
	public static void main(String[] args) {
		CalcGyro robot = new CalcGyro();
		for (int i = 0; i < 10; i++) {
			robot.runAngleCalc();
		}
		System.out.println(robot.getAngle());
	}
}
