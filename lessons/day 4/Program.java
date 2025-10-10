public class Program{ // Declares a public class named Program

	public static void main(String[] args) { // Declares the main method, the entry point of the program

		String firstName = "John"; // Initializes a String variable firstName with the value "John"

		// ? Primitives types
		char middleInitial = 'A'; // Initializes a char variable middleInitial with the value 'A'

		int age=20; // Initializes an integer variable age with the value 20
		long   population = 7_900_000_000L;  // Initializes a long variable population with the value 7,900,000,000 Suffix L indicates it's a long literal

		float  price      = 10.99F;          // Initializes a float variable price with the value 10.99 Suffix F indicates it's a float literal
		double tax        = 0.07;            // Initializes a double variable tax with the value 0.07

		boolean isAdult = age >= 18; // Initializes a boolean variable isAdult to true if age is 18 or older
		boolean hasLicense = true; // Initializes a boolean variable hasLicense with the value true

		System.out.println(Byte.MIN_VALUE); // Prints the minimum value a byte can hold
		System.out.println(Byte.MAX_VALUE); // Prints the maximum value a byte can hold

	}

}