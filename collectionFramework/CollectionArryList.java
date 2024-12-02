
import java.util.ArrayList;
import java.util.Collection;

public class CollectionArryList {
    public static void main(String[] args) {
        // in collection we cannot get the elements index.
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(34);
        nums.add(1);
        nums.add(12);
        nums.add(89);
        nums.add(66);

        System.out.println(nums);// output -> [10, 34, 1, 12, 89, 66]
    }
}
