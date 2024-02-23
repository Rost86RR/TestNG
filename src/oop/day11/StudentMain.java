package oop.day11;

public class StudentMain {

    public static void main(String[] args){

//        Student stu = new Student();
//
//        // 1. using object reference variables
//        stu.sid = 101;
//        stu.sname = "John";
//        stu.grad = 'A';
//        stu.printStudentData();

        // 2. using the method
//        Student stu1 = new Student();
//        stu1.setStudentData(102, "Mike", 'B');
//        stu1.printStudentData();

        // 3. using constructor
        Student stu3 = new Student(103, "Marry", 'A');
        stu3.printStudentData();
    }
}
