public class Program{ // Declares a public class named Program

	public static void main(String[] args) { // Declares the main method, the entry point of the program

		int monthlyAmortization = 5_000; // Declares an integer variable named monthlyAmortization and initializes it to 5000
		int numberOfMonthInYear = 12; // Declares an integer variable named numberOfMonthInYear and initializes it to 12
		final int totalAmortization = monthlyAmortization * numberOfMonthInYear; // Declares a constant integer variable named totalAmortization and initializes it to the product of monthlyAmortization and numberOfMonths
		System.out.println("Total Amortization: " + totalAmortization); // Prints the string "Total Amortization: " followed by the value of totalAmortization to the console
	}

}