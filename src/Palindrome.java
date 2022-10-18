import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Palindrome

{
    public static void main(String[] args)
    {
        System.out.println("Enter any Number");    //Main method
        Scanner scanner = new Scanner(System.in);  // Scanner class
        int n = scanner.nextInt();  //Variable
        int c=n;  //Variable to store the original value of n in c
        int s=0;  //Variable
        int r;    //Variable

        while(n>0)   //While loop
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;

        }
        if(c==s)     // if else condition
        {
            System.out.println( c + " is Palindrome Number");    // Print statement

        }else
        {
            System.out.printf( c + " is Not Palindrome Number");  // Print statement
        }

    }


}
