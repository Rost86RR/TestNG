package oop.day12.encapsulation;

public class AccountMain {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAccno(101);
        acc.setName("John");
        acc.setAmount(5000);

        System.out.println(acc.getAccno());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
