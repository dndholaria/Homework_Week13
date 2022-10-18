import java.util.Scanner;


public class Print_Sequence_Fibonacci
{

    public static void main(String[] args)  //Main Method
    {
      Scanner scanner = new Scanner(System.in);// Object for Scanner _ scanner is object _ new Scanner is constructor
        System.out.println("Enter the number of terms (For Eg.To print 8 sequence for fibonacci series, ENTER 8) "); // statement
        int a = 1;   int b = 1;  int c;
        int n = scanner.nextInt();  // variable declared

        System.out.println(a);  // statement for variable a
        System.out.println(b);  // statement for variable b

        for (int i =3; i<=n ; i++) // Syntax for loop
            {

                c = a +b;

                System.out.println(c);

                a=b;
                b=c;

        }









    }



}
