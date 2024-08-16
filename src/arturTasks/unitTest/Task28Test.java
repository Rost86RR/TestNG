package arturTasks.unitTest;

import arturTasks.Task28;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task28Test {

    @Test
    public void greaterThan1000(){
        Scanner mockScanner = new Scanner("2000");
        int result = Task28.greaterThan1000OrNot(mockScanner);
        Assert.assertEquals(result, 200);
    }

    @Test
    public void lessThan1000(){
        Scanner mockScanner = new Scanner("10");
        int result = Task28.greaterThan1000OrNot(mockScanner);
        Assert.assertEquals(result, 10);
    }
}
