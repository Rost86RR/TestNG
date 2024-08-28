package arturTasks;

import java.util.Scanner;

public class Task210 {

    public static int replace(Scanner scanner){
        System.out.println("Enter an Integer: ");
        int a = scanner.nextInt();
        if(a > 100){
        String numberStr = String.valueOf(a);
        String modifiedStr = numberStr.charAt(0) + "8" + numberStr.substring(2);
        return Integer.parseInt(modifiedStr);
        }else {
            return a;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = Task210.replace(scanner);
        System.out.println(result);

    }
}
