package javva.day20;

import java.util.ArrayList;
import java.util.Iterator;

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
        mylist.remove(10.5); //remove the special element
        System.out.println(mylist);
        mylist.remove(1); //remove 1 is index of element
        System.out.println(mylist);

        //Adding data into special place
        mylist.add(2, "putInScopeAddingIndex");
        System.out.println(mylist);

        //Modify element in the arraylist(modify/replace/change)
        mylist.set(0, "python");
        System.out.println("After replacing: " + mylist);

        //Access specific element from arraylist
        System.out.println(mylist.get(3));

        //Reading all the elements from arraylist-----------------------------------------------------------------------

        //using normal for loop
        for(int i = 0; i < mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        //using for ... each loop
        for(Object x : mylist){
            System.out.println(x);
        }

        //using iterator
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //--------------------------------------------------------------------------------------------------------------

        //Checking arraylist is empty or not
        System.out.println("Is the arraylist empty: " + mylist.isEmpty());

        //Remove all the elements from array list-----------------------------------------------------------------------
        ArrayList mylist2 = new ArrayList();
        mylist2.add("python");
        mylist2.add('A');
        mylist2.add(null);

        System.out.println("This is mylist2: " + mylist2);
        System.out.println("This is mylist: " + mylist);
        mylist.removeAll(mylist2); //removing multipule elements
        System.out.println("This is mylist2 after removing multipule elements: " + mylist2);
        System.out.println("This is mylist after removing multipule elements: " + mylist);

        //Remove all the elements/clear
        mylist2.clear();
        System.out.println("Is the arraylist empty: " + mylist2.isEmpty());
    }
}
