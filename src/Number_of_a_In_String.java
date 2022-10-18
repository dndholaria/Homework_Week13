import java.util.Scanner;

public class Number_of_a_In_String
{

    public static void main(String[] args)   //main method
    {
        Scanner scanner = new Scanner(System.in); // scanner
        System.out.println("Enter String"); // statement
        String word = scanner.nextLine(); // Declared local variable stringe
        int count = 0; // Local variable
        int l = word.length(); // Local variable


        for (int i=0; i< l; i++)  //Loop syntax
        {
            char ch = word.charAt(i);
            if (ch=='a')  // if syntax
                count++;
        }
        System.out.println(count);  //statement
    }
}
