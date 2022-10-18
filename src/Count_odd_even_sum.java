import java.sql.SQLOutput;
import java.util.Scanner;

public class Count_odd_even_sum

{

    public static void main(String[] args)     // Main method
    {

        Scanner scanner = new Scanner(System.in);   // Scanner

        int even_count =0;   // Local variable with value 0 now.
        int odd_count = 0;   // Local Variable with value 0 now.


        System.out.println("Enter five digit number");   //Print statement
        int n = scanner.nextInt();  // Variable


        while (n>0)    // While loop syntax
        {
            if (n % 2 == 0) {      // n%2 = 0 = even number
                even_count++;      //  if else conditional statement
            } else {
                odd_count++;       // counts odd numbers
            }

            n = n / 10;
        }
            System.out.println();

            System.out.println( "Total even count is ;" +even_count);  // print statement for to count even no
            System.out.println( "Total Odd  count is ;" +odd_count);   // print statement for to count odd no



    }
}
