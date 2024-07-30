package arturTasks;

import java.util.Scanner;

public class Task22 {

    public static String evenOrOdd(Scanner scanner)
    {
        System.out.println("Inter an Integer:");
        int a = scanner.nextInt();
        if(a == 0)
        {
            return "This value is zero";
        } else if (a % 2 == 1 || a % 2 == -1)
        {
            return "This value is odd";
        } else
        {
            return "This value is even";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = Task22.evenOrOdd(scanner);
        System.out.println(result);
    }
}
