package javva.day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        //Declaration
        HashSet myset = new HashSet<>();

        //Adding an element into the hashset
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');
        myset.add(null);
        myset.add(null); //multinull will not add into the hashset
        myset.add(100); //dublicate will not add into the hashset
        myset.add('A'); //dublicate will not add into the hashset
        System.out.println(myset); //[null, A, 100, 10.5, welcome, true]

        //Removing element
        myset.remove(10.5); //10.5 is value (not an index)
        System.out.println("After removing: " + myset); //[null, A, 100, welcome, true]

        //Inserting element - not possible
        //Access specific element - not possible

        //Convert HashSet-->ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al.get(2));

        //Read all the elements using for ... each
        for(Object x : myset){
            System.out.println(x);
        }

        //using iterator
        Iterator <Object> it = myset.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Size of hashset
        System.out.println("Size of the hashset: " + myset.size());

        //Clearing all the elements in hashset
        myset.clear();;
        System.out.println(myset);
    }
}
