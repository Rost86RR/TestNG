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
        Task1 task1 = new Task1();
        String result = task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is less than 10");
    }

    @Test
    public void testIndetificationValueGreater()
    {
        Scanner mockScanner = new Scanner("14");
        Task1 task1 = new Task1();
        String result = task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is greater than 10");
    }

    @Test
    public void testIndetificationValueEqual()
    {
        Scanner mockScanner = new Scanner("10");
        Task1 task1 = new Task1();
        String result = task1.indetificationValue(mockScanner);
        Assert.assertEquals(result, "This value is 10");
    }

}
