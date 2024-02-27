package oop.day15;

class Test
{
    final int x = 100; // cannot be change because it is constant
}
public class FinalKeyword {

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.x); // 100 unchangeable
    }
}
