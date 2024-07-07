package javva.day18;

import java.util.Scanner;

public class HandleExeptions {

    public static void main(String[] args) {


        //Example 1
        System.out.println("program is started...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        try
        {
            System.out.println(100 / num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid data ...");
        }

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");

    }
}
