import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)  //Main method
    {
        Scanner scanner = new Scanner(System.in); // Scanner
        System.out.println("Enter Number"); // Statement
        int n = scanner.nextInt();  // Local variable
        int count = 0;  // Local variable

        if (n > 1)   // if else formula
        {
            for (int i = 1; i<=n; i++ )  // for loop formula
            {
                if(n%i==0)
                    count++;
            }
            if(count ==2)    // if else conditional statement
            {
                System.out.println("Its Prime Number");  // Print statement for prime number
            }
            else
            {
                System.out.println("Its Not Prime Number"); // Print statement for not prime number

            }
        }


    }
}
