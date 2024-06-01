package javva.day18;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        //Example 1
        System.out.println("program is started...");
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println(100/num1);
        //if we divide num on 0, then we get: ArithmeticException
        */

        /*
        //Example 2
        int a[] = new int[5];
        System.out.println("Enter the position(0-4):");
        int pos = sc.nextInt();
        System.out.println("Enter a value:");
        int value = sc.nextInt();
        a[pos] = value;
        System.out.println(a[pos]);
        //if we put 5 to array, then we get: ArrayIndexOutOfBoundsException
        */

        /*
        //Example3
        String s = "12345";
        //String s = "welcome"; //- NumberFormatException
        int num3 = Integer.parseInt(s);
        System.out.println(num3);
         */

        /*
        //Example4
        String s4 = "welcome";
        //String s4 = ""; - 0
        //String s4 = null; - NullPointerException
        System.out.println(s4.length());
         */
    }
}
