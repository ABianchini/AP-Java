package inheritance;

import java.util.Random;

public class RandomRobot extends Robot {
	public RandomRobot() {
		
	}
	public void runMaze() {
		while (x != 9 && y!=10) {
			Random gen = new Random();
			int randomNumber = gen.nextInt(3);
			move(randomNumber);
		}
	}
}