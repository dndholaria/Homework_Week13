import java.util.Scanner;

public class Armstrong_Number
{

    // Armstrong number
    public static void main(String[] args)   //Main method
    {

        Scanner scanner = new Scanner(System.in);  //Scanner
        System.out.printf("Enter any number");  // Print statement
        int n = scanner.nextInt();  // Variable / Input number
        int arm = 0;  // Variable to check value of Armstrong
        int rem; // variable for remainder
        int c;  // variable to store original value of n
        c=n;

        while (n>0)    // While loop
        {
            rem = n%10;    // Equation to check remainder
            arm = (rem*rem*rem) + arm;  // Equation to find out value of Armstrong number
            n=n/10;

        } if(c==arm)   // if else statement to check entered value is Armstrong or not
        {
            System.out.println( c + " is Armstrong Number");    // Print statement

        } else
        {
            System.out.println( c + " is not Armstrong Number");    // Print statement

        }

    }
}
