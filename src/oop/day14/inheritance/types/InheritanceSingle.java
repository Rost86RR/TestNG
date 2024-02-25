package oop.day14.inheritance.types;
// single inheritance
class A
{
    int a = 100;
    void display()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int b = 200;
    void show()
    {
        System.out.println(b);
    }
}

public class InheritanceSingle {

    public static void main(String[] args) {

        B bobj = new B();

        System.out.println(bobj.a);
        System.out.println(bobj.b);

        bobj.show();
        bobj.display();
    }

}
