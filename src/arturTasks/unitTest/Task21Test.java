package arturTasks.unitTest;

import arturTasks.Task21;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Scanner;

public class Task21Test {

    @Test
    public void positiveValue(){
        Scanner mockScanner = new Scanner("1");
        String result = Task21.positiveOrNegative(mockScanner);
        Assert.assertEquals(result, "This value is positive");
    }

    @Test
    public void negativeValue(){
        Scanner mockScanner = new Scanner("-1");
        String result = Task21.positiveOrNegative(mockScanner);
        Assert.assertEquals(result, "This value is negative");
    }

    @Test
    public void zeroValue(){
        Scanner mockScanner = new Scanner("0");
        String result = Task21.positiveOrNegative(mockScanner);
        Assert.assertEquals(result, "This value is 0");
    }
}
