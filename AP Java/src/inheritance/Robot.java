package inheritance;

public class Robot {
	public int x;
	public int y;
	public int justMoved;
	public int finalPositionX = 9;
	public int finalPositionY = 10;
	
	public void move(int direction) {
		switch (direction) {
		case 0:
			if (checkTile(direction)){
			y--;
			justMoved++;}
			break;
		case 1:
			if (checkTile(direction)) {
			x++;
			justMoved++;}
			break;
		case 2:
			if (checkTile(direction)) {
			y++;
			justMoved++;}
			break;
		case 3:
			if (checkTile(direction)){
			x--;
			justMoved++;}
			break;
		}
	}
	
	private boolean checkTile(int direction) {
		boolean clear = true;
		switch (direction) {
		case 0:
			m.asteriskPresent(x, y-1);
			break;
		case 1:
			m.asteriskPresent(x+1, y);
			break;
		case 2:
			m.asteriskPresent(x, y+1);
			break;
		case 3:
			m.asteriskPresent(x+1, y);
			break;
		}
		return clear;
	}
}
