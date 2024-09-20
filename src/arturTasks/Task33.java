package arturTasks;

import java.util.Scanner;

public class Task33 {

    public static String task33(Scanner scannerFirst, Scanner scannerSecond){
        System.out.println("Enter an integer A: ");
        int a = scannerFirst.nextInt();
        System.out.println("Enter an integer B: ");
        int b = scannerSecond.nextInt();
        if(a > 0 && a < 10){
            if(b < a){
                return "B is less than A";
            } else if (b == a) {
                return "B is equal A";
            } else {
                return "B is greater that A";
            }
        }else {
            if(b > 100){
                return "B is greater than 100";
            } else {
                return "B is less than 100";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        String result = Task33.task33(scannerA, scannerB);
        System.out.println(result);
    }
}
