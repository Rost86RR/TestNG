package arturTasks;

import java.util.Scanner;

public class Task1 {

    public static String indetificationValue(Scanner scanner){
        System.out.println("Please enter an integer: ");
        int a = scanner.nextInt();
        if (a > 10)
        {
           return "This value is greater than 10";
        } else if (a < 10)
        {
            return "This value is less than 10";
        }
        else
        {
            return "This value is 10";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        String result = task1.indetificationValue(scanner);
        System.out.println(result);
    }
}
