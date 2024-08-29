package arturTasks;

import java.util.Scanner;

public class Task31 {

    public static String methodTask31(Scanner scannerA, Scanner scannerB){
        System.out.println("Enter a first integer:");
        int a = scannerA.nextInt();
        System.out.println("Enter a second integer:");
        int b = scannerB.nextInt();
        if(a == b){
            if(b % 2 == 0){
                return "Second Integer is even";
            }else {
                return "Second Integer is odd";
            }
        }else{
            if(b % 7 == 0){
                return "The second integer is divisible by 7";
            }else {
                return "The second integer is not divisible by 7";
            }
        }

    }


    public static void main(String[] args) {

        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        String result = Task31.methodTask31(scannerA, scannerB);
        System.out.println(result);
    }
}
