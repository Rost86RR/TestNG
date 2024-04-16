package javva.day17;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        AccessModifiersTest1 amt1 = new AccessModifiersTest1(); // default access modifier
        System.out.println(amt1.x);
        amt1.m1();
    }
}
