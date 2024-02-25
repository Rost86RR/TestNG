package oop.day14.inheritance.types;

class Parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}

class Child1 extends Parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}

class Child2 extends Parent
{
    void print(int c)
    {
        System.out.println(c);
    }
}

public class InheritanceHierarchy {

    public static void main(String[] args) {

        Child1 ch1 = new Child1();

        ch1.display(44);
        ch1.show(77);

        Child2 ch2 = new Child2();

        ch2.display(55);
        ch2.print(88);
    }
}
