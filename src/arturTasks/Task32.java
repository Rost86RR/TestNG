package arturTasks;

import java.util.Scanner;

public class Task32 {

    public static int methodTask32(Scanner scannerA, Scanner scannerB){
        System.out.println("Enter first integer:");
        int a = scannerA.nextInt();
        System.out.println("Enter second integer:");
        int b = scannerB.nextInt();

        if(a * b < 0){
            int modul = Math.abs(a - b);
            if(modul < 100){
                return a + b;
            } else if (modul > 100 && modul % 10 != 6) {
                return a * b;
            } else {
                return b;
            }
        } else if (a * b > 0) {
            int sum = a + b;
            if(sum > 100 && sum % 2 == 0){
                return sum / 100 * 100 + 30 + sum % 10;
            } else if (a % 2 == 0 && b % 2 == 0 && (a >= -9 && a <= 9) && (b >= -9 && b <= 9)) {
                return (a * b) / 10 * 10;
            }
        }

        return a * b;
    }

    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        int result = Task32.methodTask32(scannerA, scannerB);
        System.out.println(result);
    }
}
