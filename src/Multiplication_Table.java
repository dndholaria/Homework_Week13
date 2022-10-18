import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args) { //main method

        Scanner scanner = new Scanner(System.in); // scanner
        System.out.println("Enter any number to print multiplication table"); //statement
        int n = scanner.nextInt(); // Declared local variable using scanner
        int multiplication; // Declared variable

        for(int i =1 ; i<=10; i++)  //for loop syntax
        {
            multiplication = n*i;

            System.out.println( n + "x" + i +"=" +multiplication );  // print statement
        }
    }
}
