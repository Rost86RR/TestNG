package arturTasks;

import java.util.Scanner;

public class Task21 {

    public static String positiveOrNegative (Scanner scanner){
        System.out.println("Please enter an integer: ");
        int a = scanner.nextInt();
        if(a > 0)
        {
            return "This value is positive";
        }
        else if (a < 0)
        {
            return "This value is negative";
        }
        else
        {
            return "This value is 0";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = Task21.positiveOrNegative(scanner);
        System.out.println(result);
    }
}
