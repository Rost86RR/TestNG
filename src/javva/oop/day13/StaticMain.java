package javva.oop.day13;

public class StaticMain {

    public static void main(String[] args) {

        System.out.println(Staticdemo.a);   // This is static variable from another class
        Staticdemo.m1();                    // This is static method from another class

        Staticdemo stm = new Staticdemo();
        stm.m();                            // This is non-static method from another class
        stm.m2();                           // This is non-static method from another class
        System.out.println(stm.b);          // This is non-static variable from another class
    }
}
