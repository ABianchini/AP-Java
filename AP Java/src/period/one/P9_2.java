package period.one;

import java.util.ArrayList;

public class P9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataSet data = new DataSet();
		ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
		for(Quiz q : quizzes){
			data.add(q);
		}
		System.out.println("Average: "+data.getAverage());
		System.out.println("Highest Score: "+data.getMaximum());
	}
}