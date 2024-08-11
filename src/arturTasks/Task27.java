package arturTasks;

import java.util.Scanner;

public class Task27 {

    public static int opposite(Scanner scanner){
        System.out.println("Enter an integer:");
        int scannerValue = scanner.nextInt();
        if(scannerValue > 0){
            return scannerValue * -1;
        } else if (scannerValue < 0) {
            return scannerValue * -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Task27.opposite(scanner);
        System.out.println(result);
    }
}
