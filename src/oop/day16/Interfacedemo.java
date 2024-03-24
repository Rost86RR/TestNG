package oop.day16;

interface Shape
{
    int length = 10; // final & static
    int width = 20; // final & static

    void circle(); // abstract method

    static void rectangle()
    {
        System.out.println("this is rectangle - static method ");
    }

    default void square()
    {
        System.out.println("this is square - default method ");
    }
}


public class Interfacedemo implements Shape
{
    public void circle() {
        System.out.println("this is circle - abstract method");
    }

    void triangle()
    {
        System.out.println("this is triangle...");
    }

    public static void main(String[] args) {

        // Scenario 1
        Interfacedemo idobj = new Interfacedemo();

        idobj.circle();    // abstract method
        idobj.square();    // default method
        Shape.rectangle(); // static method can directly access from interface
        idobj.triangle();  // this method belongs to Interfacedemo class only

        // Scenario 2
        Shape sh = new Interfacedemo();
        sh.circle(); // abstract method
        sh.square(); // default method
        Shape.rectangle(); // static method can directly access from interface

        System.out.println(Shape.length * Shape.width); // accessing static variables directly
    }
}
