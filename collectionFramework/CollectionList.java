package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(34);
        nums.add(1);
        nums.add(12);
        nums.add(89);
        nums.add(66);

       System.out.println(nums.get(4)); // List also provides us with a 
       // method that gives us the elemnents index.
       for (Integer integer : nums) {
        
           System.out.println(integer);
       }
    }
}
