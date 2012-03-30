package period.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Quiz implements Measurable{

	/**
	 * Do not mess up the order or the letter method may not work.
	 */
	private static final double A_PLUS = 4.15;
	private static final double A = 4.0;
	private static final double A_MINUS = 3.7;
	private static final double B_PLUS = 3.3;
	private static final double B = 3.0;
	private static final double B_MINUS = 2.7;
	private static final double C_PLUS = 2.3;
	private static final double C = 2.0;
	private static final double C_MINUS = 1.7;
	private static final double D_PLUS = 1.3;
	private static final double D = 1.0;
	private static final double F = 0.0;


	private double grade = 0;

	public Quiz(double g){
		this.grade = g;
	}
	
	public static void main(String[] args){
		DataSet data = new DataSet();
		ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
		for(Quiz q : quizzes){
			data.add(q);
		}
		System.out.println("Average: "+data.getAverage());
		System.out.println("Highest Score: "+data.getMaximum());
	}
	
	
	public static Quiz getUserInput(){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number grade: ");
		try {
			String line = in.readLine();
			Quiz q = new Quiz(Double.parseDouble(line));
			System.out.println();
			return q;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Uses reflection (java.lang.reflect) to get the letter grade of the supplied GPA
	 * @return
	 */
	public String getLetterGrade(){
		String g = "";
		try{
			Class<Quiz> cl = Quiz.class;
			Field[] fields = cl.getDeclaredFields();
			for(Field f : fields){
				int mod = f.getModifiers();
				if (Modifier.isPrivate(mod) && Modifier.isStatic(mod)
						&& Modifier.isFinal(mod) && f.getType() == double.class) { //detects if a field is a grade or not
					if(grade >= f.getDouble(null)){
						g = formatName(f.getName());
						return g;
					}
				}

			}
		}catch(Exception ex){
			ex.printStackTrace();
		}

		return g;
	}
	
	/**
	 * Formats the grade letter based on the name of the field obtained via reflection
	 * @param field
	 * @return
	 */
	private String formatName(String field){
		String formatted = "";
		formatted += field.charAt(0);
		if(field.contains("MINUS")) formatted += "-";
		if(field.contains("PLUS")) formatted += "+";
		return formatted;
	}

	@Override
	public double getMeasure() {
		return grade;
	}
	
	public String toString(){
		return getLetterGrade()+" "+grade;
	}

}