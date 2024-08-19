package arturTasks;

import java.util.Scanner;

public class Task29 {

    public static int lastNumber3(Scanner scanner){
        System.out.println("Enter an integer:");
        int a = scanner.nextInt();
        if(a % 10 == 3){
            return (a + 1) / 2;
        }else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Task29.lastNumber3(scanner);
        System.out.println(result);
    }
}
