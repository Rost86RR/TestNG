package arturTasks.unitTest;

import arturTasks.Task26;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task26Test {

    @Test
    public void divisibleByTwoAndSeven(){
        Scanner mockScanner = new Scanner("28");
        String result = Task26.divisibleByTwoOrSeven(mockScanner);
        Assert.assertEquals(result, "This number is divisible by 2 and 7");
    }

    @Test
    public void divisibleByTwoOrSeven(){
        Scanner mockScanner = new Scanner("21");
        String result = Task26.divisibleByTwoOrSeven(mockScanner);
        Assert.assertEquals(result, "This number is divisible by 2 or 7");
    }

    @Test
    public void notDivisibleByTwoOrSeven(){
        Scanner mockScanner = new Scanner("15");
        String result = Task26.divisibleByTwoOrSeven(mockScanner);
        Assert.assertEquals(result, "This number is not divisible by 2 or 7");
    }
}
