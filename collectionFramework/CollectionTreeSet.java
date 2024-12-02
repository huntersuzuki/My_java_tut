package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet {
    public static void main(String[] args) {
         Set<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(34);
        nums.add(1);
        nums.add(12);
        nums.add(12);
        nums.add(66);

        // TreeSet sorts our elements and also returns unique elements.
        System.out.println(nums); // output -> [1, 10, 12, 34, 66]
    }
}
