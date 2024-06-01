package javva.oop.day11;

public class Greetings {

    // 1. No params, no returns value method

    void m1()
    {
        System.out.println("Helo...");
    }

    // 2. No params, returns value method

    String m2()
    {
        return("Hello, how are you?");
    }

    // 3. Takes params, no returns value method

    void m3(String name)
    {
        System.out.println("Hello " + name);
    }

    // 4. Takes params, returns value method

    String m4(String name)
    {
        return("Hello " + name);
    }
}
