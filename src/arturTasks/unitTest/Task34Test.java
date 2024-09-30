package arturTasks.unitTest;

import arturTasks.Task34;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task34Test {

    @Test
    public void b_less_A_B_positive() {
        Scanner mockScannerA = new Scanner("9");
        Scanner mockScannerB = new Scanner("8");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is less that A and B is positive");
    }

    @Test
    public void b_less_A_B_negative() {
        Scanner mockScannerA = new Scanner("19");
        Scanner mockScannerB = new Scanner("-8");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is less that A and B is negative");
    }

    @Test
    public void b_less_A_B_0() {
        Scanner mockScannerA = new Scanner("19");
        Scanner mockScannerB = new Scanner("0");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is less that A and B equal 0");
    }

    @Test
    public void b_greater_A_A_positive() {
        Scanner mockScannerA = new Scanner("1");
        Scanner mockScannerB = new Scanner("20");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is greater that A and A is positive");
    }

    @Test
    public void b_greater_A_A_negative() {
        Scanner mockScannerA = new Scanner("-1");
        Scanner mockScannerB = new Scanner("80");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is greater that A and A is negative");
    }

    @Test
    public void b_greater_A_A_0() {
        Scanner mockScannerA = new Scanner("0");
        Scanner mockScannerB = new Scanner("87");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is greater that A and A is equal 0");
    }

    @Test
    public void b_equal_A() {
        Scanner mockScannerA = new Scanner("50");
        Scanner mockScannerB = new Scanner("50");
        String result = Task34.task34(mockScannerA, mockScannerB);
        Assert.assertEquals(result, "B is equal A");
    }
}
