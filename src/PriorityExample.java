import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void testOne()
    {
        System.out.println("This is Test 1");
    }

    @Test(priority = 1)
    void testTwo()
    {
        System.out.println("This is Test 2");
    }

    @Test(priority = 2)
    void testThree()
    {
        System.out.println("This is Test 3");
    }

    @Test(priority = 3, enabled = false)
    void testFour()
    {
        System.out.println("This is Test 4");
    }
}
