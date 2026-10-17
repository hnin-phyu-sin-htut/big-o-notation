import java.util.Arrays;

public class Practice4 {

    /*
        O(n log n) - Linearithmic Time
        => Merge Sort
        => Divide the array into halves
        => Sort both halves separately
        => Merge the two sorted halves
     */

    static void main() {
        int[] unsortedArray = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArray = sortedArray(unsortedArray);
        System.out.println("Merge Sort : " + Arrays.toString(sortedArray));
    }

    public static int[] sortedArray(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2; // half the array

        // array, from, to
        // => don't access ending index
        // => index 0, mid - 1
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);

        // array, from, to
        // mid, arr.length - 1
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        /*
            => sort left and right halves separately
            => merge two sorted arrays
         */
        int[] sortedLeft = sortedArray(leftHalf);
        int[] sortedRight = sortedArray(rightHalf);

        return merge(sortedLeft, sortedRight);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
