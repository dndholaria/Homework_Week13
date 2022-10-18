import java.util.Scanner;

public class Sum_First_and_Last_Digit
{

    public static void main(String[] args)   //Main method
    {
        Scanner scanner = new Scanner(System.in);  //Scanner
        System.out.println("Entered any value");   // Print statement
        int n = scanner.nextInt();                // Variable declared to input any number

        // To find the last digit, use % operator

        int lastDigit = n%10;

        int firstDigit = n;

        while (firstDigit>=10)   //While loop syntax
        {
            firstDigit = firstDigit/10;   // equation to find first digit

        }
        System.out.println("First Digit = " +firstDigit);   // Print statement for first digit
        System.out.println("Last Digit = " +lastDigit);     // Print statement for Last digit

        System.out.println("Sum of first and last digit = " + (firstDigit + lastDigit) );  // Print statement for sum of first  and last digit






    }
}
