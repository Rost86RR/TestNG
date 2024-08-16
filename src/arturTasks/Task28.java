package arturTasks;

import java.util.Scanner;

public class Task28 {

    public static int greaterThan1000OrNot(Scanner scanner){
        System.out.println("Inter an integer:");
        int a = scanner.nextInt();
        if(a > 1000){
            return a / 10;
        }else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Task28.greaterThan1000OrNot(scanner);
        System.out.println(result);
    }
}
