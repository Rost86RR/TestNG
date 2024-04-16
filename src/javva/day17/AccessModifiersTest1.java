package javva.day17;

public class AccessModifiersTest1 {

    private int p = 100; // private access modifier
    void p1() // private access modifier
    {
        System.out.println(p);
    }

    int x = 100;

    void m1()
    {
        System.out.println("this is m1 ..");
    }
}
