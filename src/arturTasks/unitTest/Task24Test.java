package arturTasks.unitTest;

import arturTasks.Task24;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task24Test {

    @Test
    public void valueMinus101(){
        Scanner mockscanner = new Scanner("-101");
        String result = Task24.rangeOfNumbers(mockscanner);
        Assert.assertEquals(result, "This value is not in the range of numbers from -100 to 100");
    }

    @Test
    public void valueMinus100() {
        Scanner mockscanner = new Scanner("-100");
        String result = Task24.rangeOfNumbers(mockscanner);
        Assert.assertEquals(result, "This value is in the range of numbers from -100 to 100");
    }

    @Test
    public void value100(){
        Scanner mockscanner = new Scanner("100");
        String result = Task24.rangeOfNumbers(mockscanner);
        Assert.assertEquals(result, "This value is in the range of numbers from -100 to 100");
    }

    @Test
    public void value101(){
        Scanner mockscanner = new Scanner("101");
        String result = Task24.rangeOfNumbers(mockscanner);
        Assert.assertEquals(result, "This value is not in the range of numbers from -100 to 100");
    }
}
