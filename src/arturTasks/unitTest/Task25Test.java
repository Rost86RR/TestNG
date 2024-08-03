package arturTasks.unitTest;

import arturTasks.Task25;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Task25Test {

    @Test
    public void devisibleBy3And5(){
        Scanner mockScanner = new Scanner("45");
        String result = Task25.divisibleBy3AndBy5OrNot(mockScanner);
        Assert.assertEquals(result, "This value is divisible by 3 and 5");
    }

    @Test
    public void notDevisibleBy3And5(){
        Scanner mockScanner = new Scanner("46");
        String result = Task25.divisibleBy3AndBy5OrNot(mockScanner);
        Assert.assertEquals(result, "This value is not divisible by 3 and 5");
    }
}
