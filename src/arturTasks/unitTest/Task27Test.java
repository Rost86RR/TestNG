package arturTasks.unitTest;

import arturTasks.Task27;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Scanner;

public class Task27Test {
    @Test
    public void positive(){
        Scanner mockScanner = new Scanner("8");
        int result = Task27.opposite(mockScanner);
        Assert.assertEquals(result, "-8");
    }

    @Test
    public void negative(){
        Scanner mockScanner = new Scanner("-9");
        int result = Task27.opposite(mockScanner);
        Assert.assertEquals(result, "9");
    }

    @Test
    public void zero(){
        Scanner mockScaner = new Scanner("0");
        int result = Task27.opposite(mockScaner);
        Assert.assertEquals(result, "0");
    }
}
