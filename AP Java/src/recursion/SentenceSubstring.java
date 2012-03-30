package recursion;

public class SentenceSubstring {
	
	public String input;
	public int inputLength;
	public String output;
	public char tempChar;
	
	public SentenceSubstring(String start) {
		input = start;
	}
	
	public void reverse(int start, int end) {
		inputLength = input.length();
		int currentPos;
		currentPos = inputLength - end;
		output = "";
		while (currentPos != start-1) {
			output = output + input.charAt(currentPos);
			currentPos--;
		}
	}
	
	public String getText() {
		return output;
	}
}
