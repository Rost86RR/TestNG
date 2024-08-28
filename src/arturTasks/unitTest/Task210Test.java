package arturTasks.unitTest;

import arturTasks.Task210;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task210Test {

    @Test
    public void greater100(){
        Scanner mockscanner = new Scanner("200");
        int result = Task210.replace(mockscanner);
        Assert.assertEquals(result, 280);
    }

    @Test
    public void less100(){
        Scanner mockscanner = new Scanner("100");
        int result = Task210.replace(mockscanner);
        Assert.assertEquals(result, 100);
    }
}
