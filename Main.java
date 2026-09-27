import java.util.Scanner; // importing scanner
import java.util.Random; // importing random

class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up new scanner object
        Random random = new Random(); // set up random object

        // declare variables
        int rows = 1;
        int columns = 1;

        System.out.print("Enter the number of rows: "); // input number of rows
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: "); // input number of columns
        columns = scanner.nextInt();

        // the matrice printer
        for(int i=0; i < rows; i++){
            System.out.println();
            for(int j=0; j < columns; j++){
            int number = random.nextInt(0, 10);
            System.out.print(number + " ");
        }
        }


        scanner.close(); // close scanner

    }
}