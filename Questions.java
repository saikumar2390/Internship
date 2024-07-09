import java.util.Scanner;

public class Questions {

	public int question_1(Scanner scanner) {
		int sum = 0;
		System.out.println("1.Capital of India");
		System.out.println("a. AndhraPradesh   b.Kerala   c.Maharasthra  d.New Delhi"); // 3 spaces
		switch (scanner.next().toLowerCase()) {
		case "a": {
			System.out.println("Correct Answer : d.New Delhi\n");
			sum += 0;
		}
			break;
		case "b": {
			System.out.println("Correct Answer : d.New Delhi\n");
			sum += 0;
		}
			break;
		case "c": {
			System.out.println("Correct Answer : d.New Delhi\n");
			sum += 0;
		}
			break;
		case "d": {
			System.out.println("Correct Answer : d.New Delhi\n");
			sum += 5;
		}
			break;
		}
		return sum;
	}

	public int question_2(Scanner scanner) {
		int sum = 0;
		System.out.println("2. Capital of United States");
		System.out.println("a. Texas   b.Washington,D.C   c.Irving   d.California"); // 3 spaces
		switch (scanner.next().toLowerCase()) {
		case "a": {
			System.out.println("Correct Answer : b.Washington,D.C\n");
			sum += 0;
		}
			break;
		case "b": {
			System.out.println("Correct Answer : b.Washington,D.C\n");
			sum += 5;
		}
			break;
		case "c": {
			System.out.println("Correct Answer : b.Washington,D.C\n");
			sum += 0;
		}
			break;
		case "d": {
			System.out.println("Correct Answer : b.Washington,D.C\n");
			sum += 0;
		}
			break;
		}
		return sum;
	}

	public int question_3(Scanner scanner) {
		int sum = 0;
		System.out.println("3. Capital of Germany");
		System.out.println("a. Hamburg   b.Saxony   c.Berlin   d.HessenS"); // 3 spaces
		switch (scanner.next().toLowerCase()) {
		case "a": {
			System.out.println("Correct Answer :c.Berlin\n");
			sum += 0;
		}
			break;
		case "b": {
			System.out.println("Correct Answer : c.Berlin\n");
			sum += 0;
		}
			break;
		case "c": {
			System.out.println("Correct Answer : c.Berlin\n");
			sum += 5;
		}
			break;
		case "d": {
			System.out.println("Correct Answer : c.Berlin\n");
			sum += 0;
		}
			break;
		}
		return sum;
	}

	public int question_4(Scanner scanner) {

		int sum = 0;
		System.out.println("3. Capital of Afhghanistan");
		System.out.println("a. Balkh   b.Kabul   c.Iran   d.Tennese");
		switch (scanner.next().toLowerCase()) {
		case "a": {
			System.out.println("Correct Answer : b.Kabul\n");
			sum += 0;
		}
			break;
		case "b": {
			System.out.println("Correct Answer : b.Kabul\n");
			sum += 5;
		}
			break;
		case "c": {
			System.out.println("Correct Answer : b.Kabul\n");
			sum += 0;
		}
			break;
		case "d": {
			System.out.println("Correct Answer : b.Kabul\n");
			sum += 0;
		}
			break;
		}
		return sum;
	}
}