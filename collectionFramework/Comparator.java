package collectionFramework;

import java.util.*;

public class Comparator {
    public static void main(String[] args) {

        //Comparator is used to implement custom logic to our sorting.
        // Comparator has a method compare which returns us the value of comparison in 1 or -1 form.


        java.util.Comparator<Integer> comp = new java.util.Comparator<Integer>() {
           public int compare(Integer i,Integer j){
               if (i%10 > j%10){
                   return 1;
               }else {
                   return -1;
               }
           }
        };


        List<Integer> nums = new ArrayList<>();
        nums.add(91);
        nums.add(85);
        nums.add(18);
        nums.add(39);
        nums.add(63);
        Collections.sort(nums,comp);
        System.out.println(nums);

    }
}
