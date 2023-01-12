import java.util.Scanner;

// creating a pattern using nested for loop
public class AsteriskPattern {

    static Scanner input = new Scanner(System.in);

    // method to print  pattern
    public static void astPrint(int ast) {

        System.out.print("Enter a character of your choice: ");
        String str = input.nextLine();

        // outer loop for number of rows
        for (int i = 0; i < ast; i++) {
            for (int j = ast - i; j > 1; j--) {
                System.out.print(" ");
            }

            //  inner loop for number of columns
            //  values change in accordance to outer loop
            for (int k = 0; k <= i; k++) {
                // print input character entered by user.
                System.out.print(str + " ");
            }

            // end line after each row
            System.out.println();

        }
    }

    // main method to run the programme.
    public static void main(String[] args) {
        //scanner object to take input from the user.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of row of your choice: ");
        int noOfRow = scanner.nextInt();

        astPrint(noOfRow);
    }
}

