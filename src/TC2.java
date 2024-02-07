import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will execute before Class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This will execute after Class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every Method");
    }

    @Test
    void test3()
    {
        System.out.println("This is test 3 ...");
    }

    @Test
    void test4()
    {
        System.out.println("This is test 4 ...");
    }

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("This will execute before the Suite");
    }

    @AfterSuite
    void afterSuite()
    {
        System.out.println("This will execute after the Suite");
    }

}
