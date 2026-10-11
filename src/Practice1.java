import java.util.HashMap;

public class Practice1 {

    /*
        O(1) - Constant Time
        => The input size does not matter.
        => We can just directly access the target element.
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[2]);

        int firstElement = nums[0];
        System.out.println(firstElement);

        int lastElement = nums[nums.length - 1];
        System.out.println(lastElement);

        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "John");
        student.put(2, "Mary");
        System.out.println(student.get(1));
    }
}
