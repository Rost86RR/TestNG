package testNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getdata()
    {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
        return data;
    }
}
