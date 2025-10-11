public class Program { // Declares a public class named Program

    public static void main(String[] args) { // Main method: entry point of the program

        // Widening or implicit casting (small → large)
        byte score = 10;
        int finalScore = score; // automatically converts byte to int
        System.out.println(finalScore); // Output: 10

        // Narrowing or explicit casting (large → small)
        double price = 99.9;
        int updatedPrice = (int) price; // data loss: .9 removed
        System.out.println(updatedPrice); // Output: 99

        // ----------------------------------------
        // String and Wrapper class example
        // ----------------------------------------

        String gradeText = "99"; // String value
        byte grade = Byte.parseByte(gradeText); // String → byte conversion
        String result = String.valueOf(grade);  // byte → String conversion
        System.out.println(result); // Output: 99

        // ----------------------------------------
        // Simple vs Complex
        // Simple value = use parseType()
        // Complex value = use Wrapper class
        // ----------------------------------------

        // String result trick
        String sumResult = 1 + 1 + ""; // starts with numbers → adds first
        System.out.println(sumResult); // Output: "2"

        String concatResult = "" + 1 + 1; // starts with string → concatenates
        System.out.println(concatResult); // Output: "11"
    }
}
// ✅ Notes (from your summary)
// Type Casting = converting one data type to another.
// Widening (Implicit): small → large (no data loss).
// Narrowing (Explicit): large → small (possible data loss).
// Wrapper Classes (Byte, Integer, Double, etc.) are used for conversions between primitive types and String.