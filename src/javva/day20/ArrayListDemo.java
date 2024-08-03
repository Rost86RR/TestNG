package javva.day20;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Declaration
        ArrayList mylist = new ArrayList();

        //Adding data into arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(null);

        //Size of arraylist
        System.out.println("Size of an arraylist: " + mylist.size());

        //Printing arraylist
        System.out.println("Printing data from arraylist: " + mylist);

        //Remove element from arraylist
        mylist.remove(10.5);
        System.out.println(mylist);

    }
}
