package recursion;

public class Sentence {
	
	public String input;
	public int inputLength;
	public String output;
	public char tempChar;
	
	public Sentence(String start) {
		input = start;
	}
	
	public void reverse() {
		inputLength = input.length();
		int currentPos;
		currentPos = inputLength - 1;
		output = "";
		while (currentPos != -1) {
			output = output + input.charAt(currentPos);
			currentPos--;
		}
	}
	
	public String getText() {
		return output;
	}
}
