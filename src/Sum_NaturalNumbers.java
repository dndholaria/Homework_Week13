import java.util.Scanner;

public class Sum_NaturalNumbers
{
    public static void main(String[] args) {  //main method

        Scanner scanner = new Scanner(System.in); // scanner
        System.out.println("Enter Number"); // statement
        int n =  scanner.nextInt(); // Declare Local variable
        int sum = 0; // Local variable

        while(n>0) // while loop syntax
        {
            sum = sum + n;
            n--;
        }
        System.out.printf("Sum of entered natural number is  = " +sum);  // print statement to find the sum of natural no.
    }

}
