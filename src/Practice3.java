public class Practice3 {

    /*
        O(n) - Linear Time
        => number of operations grows proportionally to the input size.
     */

    static void main() {
        int[] nums = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9};

        // print all numbers
        for (int num : nums) {
            System.out.println(num);
        }

        /*
            => finding the target number
            => "break" is important
         */
        int target = 5;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Target number is in index: " + i);
//                break;
            }
        }

        /*
            => count even numbers
         */
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println("Even number: " + num);
                count++;
            }
        }
        System.out.println("Count: " + count);

        /*
            => find the max number
            => don't sort
            => don't use nested loops
         */
        int[] arr = {23, 11, 88, 34, 12, 5, 10, 98};
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Max value: " + max);
    }
}
