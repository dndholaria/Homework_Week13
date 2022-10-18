import java.util.Scanner;

public class Print_Any10Numbers
{
    public static void main(String[] args) //Main method
    {
        Scanner scanner = new Scanner(System.in); //Scanner
        System.out.println("Enter any number to print next 10 numbers"); //Statement to enter number
        int a = scanner.nextInt(); // Local variable
        int b = a+10; // Local variable


        for (a=a; a <= b; a++) // For loop
        {
            System.out.println(a);

        }


    }
}
