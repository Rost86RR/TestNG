package arturTasks;

import java.util.Scanner;


public class Task2 {

    public static int defineAndSquareOrDoubleNumber(Scanner scanner) {

        System.out.println("Please enter an integer: ");
        int a = scanner.nextInt();
        if(a > 0 && a < 10 || a > 100 && a < 1000)
        {
            return a * a;
        }
        else
        {
            return a * 2;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = Task2.defineAndSquareOrDoubleNumber(scanner);
        System.out.println(result);
    }
}
