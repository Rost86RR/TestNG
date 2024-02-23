package oop.day12.polymorphism;

import oop.day12.polymorphism.Box;

public class BoxMain {

    public static void main(String[] args) {

        Box box = new Box(); // 1
        System.out.println(box.volume());

        Box box2 = new Box(10.5, 12.5, 15.5); // 2
        System.out.println(box2.volume());

        Box box3 = new Box(15); // 3
        System.out.println(box3.volume());
    }
}
