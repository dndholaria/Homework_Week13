import java.util.Scanner;

public class Number_Division
{
    public static void main(String[] args)  // main method
    {
        Scanner scanner = new Scanner(System.in);  // scanner

        System.out.println(" (1) Numbers between 1 to 100 which can be divided by 3:");  // statement

        for(int i=1; i<=100; i++)  //for loop syntax
        {
            if (i%3==0)  // if syntax
                System.out.println(i);

        }
        System.out.println("(2) Numbers between 1 to 100 which can be divided by 5;"); //statement


        for(int i=1; i<=100; i++)
        {
            if (i%5==0)
                System.out.println(i);

        }

    }
}
