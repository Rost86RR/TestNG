package arturTasks.unitTest;

import arturTasks.Task2;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Scanner;
public class Task2Test {

    @Test
    public void testDefineAndSquareNumber5() {
        Scanner mockScanner = new Scanner(String.valueOf(1));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testDefineAndSquareNumber9() {
        Scanner mockScanner = new Scanner(String.valueOf(9));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 81);
    }

    @Test
    public void testDefineAndSquareNumber101() {
        Scanner mockScanner = new Scanner(String.valueOf(101));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 10201);
    }

    @Test
    public void testDefineAndSquareNumber999() {
        Scanner mockScanner = new Scanner(String.valueOf(999));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 998001);
    }

    @Test
    public void testDefineAndDoubleNumber0() {
        Scanner mockScanner = new Scanner(String.valueOf(0));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testDefineAndDoubleNumberMinus1() {
        Scanner mockScanner = new Scanner(String.valueOf(-1));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, -2);
    }

    @Test
    public void testDefineAndDoubleNumber10() {
        Scanner mockScanner = new Scanner(String.valueOf(10));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 20);
    }

    @Test
    public void testDefineAndDoubleNumber100() {
        Scanner mockScanner = new Scanner(String.valueOf(100));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 200);
    }

    @Test
    public void testDefineAndDoubleNumber1000() {
        Scanner mockScanner = new Scanner(String.valueOf(1000));
        int result = Task2.defineAndSquareOrDoubleNumber(mockScanner);
        Assert.assertEquals(result, 2000);
    }
}
