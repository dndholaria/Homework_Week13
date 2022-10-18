import java.util.Scanner;

public class Find_Factorial
{

    public static void main(String[] args)   // Main method

    {

        Scanner scanner = new Scanner(System.in);             // Scanner
        System.out.println("Enter number to find factorial");

        int n = scanner.nextInt();
        int fact = 1;  // Local variable declared and initialized
        int i;

        for (i =1; i<=n ; i++)  // For loop syntax
        {
            fact = fact * i;

        }

        System.out.println(fact);  // print statement


    }



}
