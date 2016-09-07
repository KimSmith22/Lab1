package gcLabs;

// import java scanner
import java.util.Scanner;

//declare public class
public class Lab1Perimeter {

		private static Scanner k;

		//declare method
		public static void main (String[] args) {
			//declare variables
			double length;
			double width;
			double height;
			
			String choice;
			choice = "y";
			
			
			//system output and user prompts
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
		//do the following:
			do {
			System.out.print("Enter Length:  ");
			k = new Scanner(System.in);
			length = k.nextDouble();
			System.out.print("Enter Width:  ");
			width = k.nextDouble();
			System.out.print("Enter Height:  ");
			height = k.nextDouble();
			
			//calculate and output area and perimeter
			System.out.println("Area:  " + (length * width));
			System.out.println("Perimeter:  " + (2 * width + 2 * length));	
			System.out.println("Volumn:  " + length * width * height);
			
			//blank space and prompt for continue
			System.out.println();
			System.out.print("Continue? (y/n): ");
			k.nextLine();
			/*this following tells the program to 
			 * store the information input by the user
			 */
			choice = k.nextLine();
			// as long as the user answers yes
			}while (choice.equals("y"));
		}
}
