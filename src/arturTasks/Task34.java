package arturTasks;

import java.util.Scanner;

public class Task34 {

    public static String task34(Scanner scannerA, Scanner scannerB){
        System.out.println("Enter an integer A:");
        int a = scannerA.nextInt();
        System.out.println("Enter an integer B:");
        int b = scannerB.nextInt();
        if(b < a) {
            if(b > 0) {
                return "B is less that A and B is positive";
            } else if (b < 0) {
                return "B is less that A and B is negative";
            } else {
                return "B is less that A and B equal 0";
            }
        } else if (b > a) {
            if(a > 0) {
                return "B is greater that A and A is positive";
            } else if (a < 0) {
                return "B is greater that A and A is negative";
            } else {
                return "B is greater that A and A is equal 0";
            }
        } else {
            return "B is equal A";
        }
    }

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        String result = Task34.task34(scannerA, scannerB);
        System.out.println(result);
    }
}
