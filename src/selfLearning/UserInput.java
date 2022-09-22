package selfLearning;
import java.util.*;

public class UserInput {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your user input :");
		int number = input.nextInt();
		System.out.println("You have entered :" + number);
		System.out.println("Thank You!!");
		input.close();
}
}