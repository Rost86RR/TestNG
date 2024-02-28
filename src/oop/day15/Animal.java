package oop.day15;

public class Animal {

    String color = "white";

    void eat()
    {
        System.out.println("Eating .....");
    }

}

class Dog extends Animal
{
    String color = "black";

    void display()
    {
        System.out.println(super.color); // become the parent variable
    }

    void eat()
    {
        System.out.println("Eating bread ...");
        super.eat(); // method from the parent class
    }
}
