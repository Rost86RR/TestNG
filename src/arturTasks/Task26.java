package arturTasks;

import java.util.Scanner;

public class Task26 {

    public static String divisibleByTwoOrSeven(Scanner scanner){
        System.out.println("Enter an integer: ");
        int a = scanner.nextInt();
        if(a % 2 == 0 && a % 7 == 0){
            return "This number is divisible by 2 and 7";
        } else if (a % 2 == 0 || a % 7 == 0) {
            return "This number is divisible by 2 or 7";
        } else {
            return "This number is not divisible by 2 or 7";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = Task26.divisibleByTwoOrSeven(scanner);
        System.out.println(result);
    }

}
