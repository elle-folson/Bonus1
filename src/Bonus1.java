/* This application will convert number grades into letter grades
 * User enters a numerical grade from 0 to 100
 * The corresponding letter grade will be displayed
 * Continue prompt
 */
import java.util.*;

public class Bonus1 {

	public static void main(String[] args) {

		int numGrade;

		Scanner input = new Scanner(System.in);
		String choice = "y";

		// user input integer prompt
		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter a numerical grade: ");
			numGrade = input.nextInt();

			//numerical to letter grade conversion
			//100-99 A+, 98-90 A, 89-87 B+, 86-80 B, 79-77 C+, 76-70 C, etc)
			if (100 >= numGrade && numGrade >= 99)
				System.out.println("Letter Grade: A+");
			if (98 >= numGrade && numGrade >= 92)
				System.out.println("Letter Grade: A");
			if (91 >= numGrade && numGrade >= 90)
				System.out.println("Letter Grade: A-");
			if (89 >= numGrade && numGrade >= 87)
				System.out.println("Letter Grade: B+");
			if (86 >= numGrade && numGrade >= 82)
				System.out.println("Letter Grade: B");
			if (81 >= numGrade && numGrade >= 80)
				System.out.println("Letter Grade: B-");
			if (79 >= numGrade && numGrade >= 77)
				System.out.println("Letter Grade: C+");
			if (76 >= numGrade && numGrade >= 72)
				System.out.println("Letter Grade: C");
			if (71 >= numGrade && numGrade >= 70)
				System.out.println("Letter Grade: C-");
			if (69 >= numGrade && numGrade >= 67)
				System.out.println("Letter Grade: D+");
			if (66 >= numGrade && numGrade >= 62)
				System.out.println("Letter Grade: D");
			if (61 >= numGrade && numGrade >= 60)
				System.out.println("Letter Grade: A");
			if (59 >= numGrade && numGrade >= 0)
				System.out.println("Letter Grade: F");
			System.out.println();
			
			// see if the user wants to continue
			System.out.print("Continue?? (y/n): ");
			choice = input.next();
			System.out.println();
		}
	}
}
