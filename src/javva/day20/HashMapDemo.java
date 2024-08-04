package javva.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //Declaration
        //HashMap hm = new HashMap(); - allowes all type
        HashMap<Integer,String> hm = new HashMap<Integer,String>(); //int - key type; String - value type;

        //Adding pairs
        hm.put(101, "John");
        hm.put(102, "Scott"); //recovered by "David" bcz not allowed dublicate of value
        hm.put(103, "Mary");
        hm.put(104, "Scott");
        hm.put(102, "David");
        System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}

        System.out.println("Size of hashmap: " + hm.size()); //4

        //Remove pair
        hm.remove(103); //103 is the key of the pair
        System.out.println(hm); //{101=John, 102=David, 104=Scott}

        //access value of the key
        hm.get(102); //102 is key
        System.out.println(hm.get(102)); //David

        //get all the keys from hashmap
        System.out.println(hm.keySet()); //[101, 102, 104]
        System.out.println(hm.values()); //[John, David, Scott]
        System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]

        //Reading data from hashmap

        //using for ... each
        for(int k : hm.keySet()){
            System.out.println(k + "  " + hm.get(k));
        }

        //using Itorator
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Clearing
        hm.clear();;
        System.out.println("Is hashmap empty: " + hm.isEmpty());
    }
}
