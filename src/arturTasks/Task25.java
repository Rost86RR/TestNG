package arturTasks;

import java.util.Scanner;

public class Task25 {


    public static String divisibleBy3AndBy5OrNot(Scanner scanner){
        System.out.println("Enter an integer:");
        int a = scanner.nextInt();
        if(a % 3 == 0 && a % 5 == 0){
            return "This value is divisible by 3 and 5";
        }else {
            return "This value is not divisible by 3 and 5";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = Task25.divisibleBy3AndBy5OrNot(scanner);
        System.out.println(result);
    }
}
