
public class PrinterApp {

	public static void main(String[] args) {
		String creator = "Viktor";
		int num1 = 150;
		int num2 = 30;
		
		// Calculate the multiplication, addition, subtraction, and division of num1 and num2
		int multiplication = num1 * num2;
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int division = num1/num2;
		// Print introductory message
		System.out.println("Printer App");
		// Print the creator's name
		System.out.println("This app is made by: " + creator);
		// Print the results of addition, subtraction, multiplication, and division
		System.out.println("The value of number 1 is: " + num1);
		System.out.println("The value of number 2 is: " + num2);
		System.out.println("The sum of numbers " + num1 + " and " + num2 + " is: " + addition);
		System.out.println("The difference between numbers " + num1 + " and " + num2 + " is: " + subtraction);
		System.out.println("The product of factors " + num1 + " and " + num2 + " is: " + multiplication );
		System.out.println("The quotient of numbers " + num1 + " and " + num2 + " is: " + division);
		

	}

}
