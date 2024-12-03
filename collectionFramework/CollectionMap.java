package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        //Map(HashMap) is a combination of Set & List, in Map the data is stored in key and value pairs.
        // we cannot add duplicate keys in HashMap but can add duplicate values.
        Map<String,Integer> students = new HashMap<String,Integer>();
        //           keys   values
        students.put("Aditya",78);
        students.put("Pranay",89);
        students.put("Mayur",97);
        students.put("Rajesh",88);
//        students.put("Pranay",99);
        // .get() method returns values of the keys.
        System.out.println(students.get("Aditya"));// output -> 78 (value of Aditya key)
        System.out.println(students); // output -> {Pranay=89, Mayur=97, Rajesh=88, Aditya=78}
        System.out.println(students); // output -> {Pranay=99, Mayur=97, Rajesh=88, Aditya=78} cannot add duplicate keys.

        // we cannot directly traverse all values of a HashMap using because it contains values
        // in the form of key & value.
        // following is the method to traverse keys & values of a hashmap using for loop.

        for (String keys:students.keySet()){
            System.out.println(keys + " : "+students.get(keys));
            // output ->
            // Pranay : 89
            //Mayur : 97
            //Rajesh : 88
            //Aditya : 78
        }

        // Map contains HashMap & HashTable
        //HashMap is not Synchronised whereas the HashTable is Synchronised.
    }
}
