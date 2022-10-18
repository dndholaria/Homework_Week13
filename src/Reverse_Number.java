import java.util.Scanner;

public class Reverse_Number
{
    public static void main(String[] args)          // Main method
    {
        Scanner scanner = new Scanner(System.in);      // Scanner class to make program more dynamic
        System.out.println("Enter Number");            // Print statement to enter any value you want to.
        int n = scanner.nextInt();                     // Declared local variable

        int reverse = 0;
        int lastDigit;

        while (n>0)                                     // While loop
        {
            lastDigit = n % 10;                         // % operator to find last digit
            reverse = reverse*10 + lastDigit;           // Equation to find reverse number
            n=n/10;
        }
        System.out.println(reverse);                    // Print statement for result

    }
}
