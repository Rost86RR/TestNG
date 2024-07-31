package arturTasks.unitTest;

import arturTasks.Task23;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task23Test {
    @Test
    public void valueMinus100(){
        Scanner mockScanner = new Scanner("-100");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is not two-digit");
    }

    @Test
    public void valueMinus99() {
        Scanner mockscanner = new Scanner("-99");
        String result = Task23.twoDigitNumberOrNot(mockscanner);
        Assert.assertEquals(result, "This value is two-digit");
    }

    @Test
    public void valueMinus10(){
        Scanner mockScanner = new Scanner("-10");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is two-digit");
    }

    @Test
    public void valueMinus9(){
        Scanner mockScanner = new Scanner("-9");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is not two-digit");
    }

    @Test
    public void value9(){
        Scanner mockScanner = new Scanner("9");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is not two-digit");
    }

    @Test
    public void value10(){
        Scanner mockScanner = new Scanner("10");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is two-digit");
    }

    @Test
    public void value99(){
        Scanner mockScanner = new Scanner("99");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is two-digit");
    }

    @Test
    public void value100(){
        Scanner mockScanner = new Scanner("100");
        String result = Task23.twoDigitNumberOrNot(mockScanner);
        Assert.assertEquals(result, "This value is not two-digit");
    }
}
