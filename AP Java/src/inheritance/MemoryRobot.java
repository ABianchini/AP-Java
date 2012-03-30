package inheritance;

import java.util.ArrayList;

public class MemoryRobot extends Robot {
	
	ArrayList<Integer> badX = new ArrayList<Integer>();
	ArrayList<Integer> badY = new ArrayList<Integer>();
	int tempJustMoved;
	boolean move0Test = true;
	boolean move1Test = true;
	boolean move3Test = true;
	
	
	public MemoryRobot() {
		
	}
	
	public void runMaze() {
		if (x != finalPositionX && y != finalPositionY) {
			tempJustMoved = justMoved;
			for (int i=0; i< badX.size(); i++) {
				move1Test = true;
				if(badX.get(i) == x+1) {
					move1Test = false;
				}
			} if (move1Test) {
				move(1);
			}
			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			if (tempJustMoved == justMoved) {
				for (int i=0; i< badX.size(); i++) {
					move0Test = true;
					if(badY.get(i) == y-1) {
						move0Test = false;
					}
				} if (move0Test) {
					move(0);
				}
				//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				if (tempJustMoved == justMoved) {
					for (int i=0; i< badX.size(); i++) {
						move3Test = true;
						if(badX.get(i) == x-1) {
							move3Test = false;
						}
					} if (move3Test) {
						move(3);
					}
					
					if (tempJustMoved == justMoved) {
						move(2);
						badX.add(x);
						badY.add(y-1);
					}
				}
			}
			
		}
	}
}
