package oop.day13;

public class Staticdemo {

    static int a =10; // static variable
    int b = 20;       // non-static variable

    static void m1()  // static method - can access static stuff directly (without object)
    {
        System.out.println("This is m1 static method");
    }

    void m2() // non-static method
    {
        System.out.println("This is m2 non-static method");
    }

    void m() // non-static method can access everything directly
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {

        System.out.println(a);
        m1(); // static method   - can access static stuff directly (without object)

        //System.out.println(b); - cannot access, b is non-static variable
        //m2();                  - cannot access, m2(); is non-static method

        // static methods can access non-static stuff through object.
        Staticdemo stm = new Staticdemo();
        System.out.println(stm.b);
        stm.m2();

        stm.m();


    }
}
