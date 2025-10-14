public class Program{ // Declares a public class named Program

	public static void main(String[] args) { // Declares the main method, the entry point of the program

        // ----- Arithmetic Operators -----
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();

        // ----- Relational Operators -----
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // ----- Logical Operators -----
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println();

        // ----- Unary Operators (Prefix & Postfix) -----
        int n = 5;
        System.out.println("Unary Operators:");
        System.out.println("Original n = " + n);
        System.out.println("Prefix ++n = " + (++n)); // increment first
        System.out.println("Postfix n++ = " + (n++)); // use first, then increment
        System.out.println("After postfix, n = " + n);
        System.out.println();

        // ----- Assignment Operators -----
        int num = 10;
        System.out.println("Assignment Operators:");
        num += 5;  // num = num + 5
        System.out.println("num += 5 → " + num);
        num *= 2;  // num = num * 2
        System.out.println("num *= 2 → " + num);
        System.out.println();

        // ----- Operator Precedence -----
        System.out.println("Operator Precedence Example:");
        int result = 10 + 5 * 2;       // * before +
        int result2 = (10 + 5) * 2;    // () first
        System.out.println("10 + 5 * 2 = " + result);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println();

        // ----- Logical Combination Example -----
        int age = 20;
        boolean hasID = true;
        if (age >= 18 && hasID) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }

        // ----- Var Example (Java 10+) -----
        var text = "Hello Java!";
        System.out.println("\nUsing var keyword: " + text);
    }


}