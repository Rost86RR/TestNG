package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void carStart()
    {
        System.out.println("Car started");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"carStart"})
    void carDrive()
    {
        System.out.println("Car is driving");
    }

    @Test(dependsOnMethods = {"carDrive"})
    void carStop()
    {
        System.out.println("Car stoped");
    }

    @Test(dependsOnMethods = {"carDrive", "carStop"}, alwaysRun = true)
    void carPark()
    {
        System.out.println("Car parked");
    }
}
