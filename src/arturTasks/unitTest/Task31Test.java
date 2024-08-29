package arturTasks.unitTest;

import arturTasks.Task31;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task31Test {

    @Test
    public void integersEqualSecondEven() {
        Scanner mockscaneerA = new Scanner("10");
        Scanner mockscannerB = new Scanner("10");
        String result = Task31.methodTask31(mockscaneerA, mockscannerB);
        Assert.assertEquals(result, "Second Integer is even");
    }

    @Test
    public void integersEqualSecondOdd() {
        Scanner mockscannerA = new Scanner("9");
        Scanner mockscannerB = new Scanner("9");
        String result = Task31.methodTask31(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "Second Integer is odd");
    }

    @Test
    public void integersNotEqualSecondDividedBy7() {
        Scanner mockscaneerA = new Scanner("10");
        Scanner mockscannerB = new Scanner("21");
        String result = Task31.methodTask31(mockscaneerA, mockscannerB);
        Assert.assertEquals(result, "The second integer is divisible by 7");
    }

    @Test
    public void integersNotEqualSecondNotDividedBy7() {
        Scanner mockscaneerA = new Scanner("10");
        Scanner mockscannerB = new Scanner("20");
        String result = Task31.methodTask31(mockscaneerA, mockscannerB);
        Assert.assertEquals(result, "The second integer is not divisible by 7");
    }
}
