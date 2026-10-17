public class Practice5 {

    /*
        O(n²) - Quadratic Time
        => n * n
        => Commonly occurs with nested loops
        => Often compares pairs of elements
        => If n = 100,
            => O(n) = 100 operations
            => O(n²) = 10,000 operations
    */

    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
