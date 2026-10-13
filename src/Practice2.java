
public class Practice2 {

    /*
        O(log n) - Logarithmic Time
        => Binary Search
        => Values must be sorted
        => Find the middle element
        => Eliminates half of the search range in each iteration
     */

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int output = binarySearch(nums, 1);
        System.out.println("Target value is in index[" + output + "].");
    }
}