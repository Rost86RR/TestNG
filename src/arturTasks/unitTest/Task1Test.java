package arturTasks.unitTest;

import arturTasks.Task1;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Scanner;

public class Task1Test {

    @Test
    public void testIndetificationValueLess()
    {
        Scanner mockScanner = new Scanner("4");
        String result = Task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is less than 10");
    }

    @Test
    public void testIndetificationValueGreater()
    {
        Scanner mockScanner = new Scanner("14");
        String result = Task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is greater than 10");
    }

    @Test
    public void testIndetificationValueEqual()
    {
        Scanner mockScanner = new Scanner("10");
        String result = Task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is 10");
    }

}
