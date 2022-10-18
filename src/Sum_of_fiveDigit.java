import java.util.Scanner;

public class Sum_of_fiveDigit
{

    public static void main(String[] args)  // main method
    {
        Scanner scanner = new Scanner(System.in);  // scanner
        System.out.println("Enter five digit number"); // statement
        int n = scanner.nextInt(); // local variable
        int sum = 0; // local variable for sum

        while (n>0)  // while loop
        {
            int temp = n % 10; // instant variable
            sum = sum + temp;
            n = n / 10;

        }
        System.out.println(" Sum of entered five digit is: " +sum  )   ;// Print statement to display the sum of entered digit

    }
}
