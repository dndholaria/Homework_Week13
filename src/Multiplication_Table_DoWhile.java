import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Multiplication_Table_DoWhile
{

    public static void main(String[] args)    // Main method
    {

        Scanner scanner = new Scanner(System.in);   //Scanner class
        System.out.println("Enter value");  //Print statement
        int a = scanner.nextInt();  // Variable declared
        int b = 1;  // Variable initialized
        int d;  // Variable for result of multiplication

        do    // Do while syntax
        {
            int c = 1;    // Variable

            do {
                d = b * c;  // Multiplication of 2 variable
                System.out.print(d +"\n"); // print statement using \n for new line
                c++;
            } while (c <= 10);

            System.out.println();
            b++;

        } while (b<=a);

    }



}

