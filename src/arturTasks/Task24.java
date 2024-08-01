package arturTasks;

import java.util.Scanner;

public class Task24 {

    public static String rangeOfNumbers(Scanner scanner){
        System.out.println("Enter an integer:");
        int a = scanner.nextInt();
        if(a >= -100 && a <= 100){
            return "This value is in the range of numbers from -100 to 100";
        }else {
            return "This value is not in the range of numbers from -100 to 100";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        String result = Task24.rangeOfNumbers(scanner);
        System.out.println(result);
    }
}
