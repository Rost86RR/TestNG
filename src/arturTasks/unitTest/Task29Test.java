package arturTasks.unitTest;

import arturTasks.Task29;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task29Test {

    @Test
    public void lastDigit3(){
        Scanner mockScanner = new Scanner("33");
        int result = Task29.lastNumber3(mockScanner);
        Assert.assertEquals(result, 17);
    }

    @Test
    public void lastDigitNot3(){
        Scanner mockScanner = new Scanner("12");
        int result = Task29.lastNumber3(mockScanner);
        Assert.assertEquals(result, 12);
    }
}
