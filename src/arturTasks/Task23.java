package arturTasks;

import java.util.Scanner;

public class Task23 {


    public static String twoDigitNumberOrNot(Scanner scanner){
        System.out.println("Inter a integer");
        int a = scanner.nextInt();
        if(a >= 10 && a <= 99 || a <= -10 && a >= -99){
            return "This value is two-digit";
        }else {
            return "This value is not two-digit";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = Task23.twoDigitNumberOrNot(scanner);
        System.out.println(result);
    }
}
