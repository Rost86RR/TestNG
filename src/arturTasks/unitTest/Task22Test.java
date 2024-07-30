package arturTasks.unitTest;

import arturTasks.Task21;
import arturTasks.Task22;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Scanner;
public class Task22Test {

    @Test
    public void evenValue(){
        Scanner mockScanner = new Scanner("256");
        String result = Task22.evenOrOdd(mockScanner);
        Assert.assertEquals(result, "This value is even");
    }

    @Test
    public void oddValue(){
        Scanner mockScanner = new Scanner("1999");
        String result = Task22.evenOrOdd(mockScanner);
        Assert.assertEquals(result, "This value is odd");
    }

    @Test
    public void zeroValue(){
        Scanner mockScanner = new Scanner("0");
        String result = Task22.evenOrOdd(mockScanner);
        Assert.assertEquals(result, "This value is zero");
    }
}
