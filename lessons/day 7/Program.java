import java.util.Scanner;

public class Program{ // Declares a public class named Program

	public static void main(String[] args) { // Declares the main method, the entry point of the program

        // byte grade = 70;
        // if (grade >= 95) {
        //     System.out.println("Excellent");
        // }  else if (grade >= 90) {
        //     System.out.println("Very Good");
        // } else if (grade >= 80) {
        //     System.out.println(" Good");
        // } else if (grade >= 75) {
        //     System.out.println("Fair");
        // }else{
        //     System.out.println("Failed");
        // }

        // byte role = 1;
        // switch (role){
        //     case 0:
        //         System.out.print("Admin");
        //         break;
        //     case 1:
        //         System.out.print("Staff");
        //         break;
        //     case 2:
        //         System.out.print("Member");
        //         break;
        //     default:
        //         System.out.print("Not member");
        // }

        // range exact value the disadvantage of case

        Scanner input = new Scanner (System.in);

        System.out.print("Enter Name: ");
        // String name = input.next();
        String name = input.nextLine();
        System.out.print("Enter Favorite number: " + name);


        System.out.print("Enter Favorite number: ");
        int favoriteNumber = input.nextInt();
        System.out.println("Nice! Your fav number is: " + favoriteNumber);


    }


}