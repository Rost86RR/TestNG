package arturTasks.unitTest;

import arturTasks.Task32;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task32Test {

    @Test
    public void differentSignsLess100(){
        Scanner mockscannerA = new Scanner("-20");
        Scanner mockscannerB = new Scanner("30");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void lastDigitIsNot6(){
        Scanner mockscannerA = new Scanner("-200");
        Scanner mockscannerB = new Scanner("300");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, -60000);
    }

    @Test
    public void lastDigit6(){
        Scanner mockscannerA = new Scanner("-206");
        Scanner mockscannerB = new Scanner("300");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, 300);
    }

    @Test
    public void theSameSignsMore100(){
        Scanner mockscannerA = new Scanner("200");
        Scanner mockscannerB = new Scanner("300");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, 530);
    }

    @Test
    public void oneDigit(){
        Scanner mockscannerA = new Scanner("8");
        Scanner mockscannerB = new Scanner("6");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, 40);
    }

    @Test
    public void otherCases(){
        Scanner mockscannerA = new Scanner("18");
        Scanner mockscannerB = new Scanner("17");
        int result = Task32.methodTask32(mockscannerA, mockscannerB);
        Assert.assertEquals(result, 306);
    }

}
