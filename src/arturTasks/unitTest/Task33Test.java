package arturTasks.unitTest;

import arturTasks.Task33;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task33Test {

    @Test
    public void bGreaterThanA(){
        Scanner mockscannerA = new Scanner("4");
        Scanner mockscannerB = new Scanner("9");
        String result = Task33.task33(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "B is greater that A");
    }

    @Test
    public void bLessThanA(){
        Scanner mockscannerA = new Scanner("8");
        Scanner mockscannerB = new Scanner("1");
        String result = Task33.task33(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "B is less than A");
    }

    @Test
    public void bequalA(){
        Scanner mockscannerA = new Scanner("5");
        Scanner mockscannerB = new Scanner("5");
        String result = Task33.task33(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "B is equal A");
    }

    @Test
    public void bGreaterThan100(){
        Scanner mockscannerA = new Scanner("50");
        Scanner mockscannerB = new Scanner("500");
        String result = Task33.task33(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "B is greater than 100");
    }

    @Test
    public void bLessThan100(){
        Scanner mockscannerA = new Scanner("-50");
        Scanner mockscannerB = new Scanner("90");
        String result = Task33.task33(mockscannerA, mockscannerB);
        Assert.assertEquals(result, "B is less than 100");
    }
}
