import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(34);
        nums.add(1);
        nums.add(12);
        nums.add(12);
        nums.add(66);

        // Hashset only accespts unique value in the element.
        // Hashset does not provide a method which returns the elemnts index.
        System.out.println(nums); // output - [1, 34, 66, 10, 12]

    }
}
