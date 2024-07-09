import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		score();
	}
	
	public static int quizConduct() {
		Scanner scanner = new Scanner(System.in);
		Questions questions = new Questions();
		System.out.println("Welcome to the QUIZ\n");
		int score = 0;
		score += questions.question_1(scanner);
		score += questions.question_2(scanner);
		score += questions.question_3(scanner);
		score += questions.question_4(scanner);
		return score;
	}
	
	public static void score() {
		int scores = quizConduct();
		System.out.println("Score : "+scores+" / "+ 20);
	}

}
