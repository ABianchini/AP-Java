package recursion;

public class SentenceTester {
	public static void main(String[] args) {
		Sentence greet = new Sentence("Hello world");
		greet.reverse();
		System.out.println(greet.getText());
	}
}
