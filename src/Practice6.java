public class Practice6 {

    /*
        O(2ⁿ) - Exponential Time
        => Each call creates two recursive calls
     */

    static void main() {
        /*
            => 2⁴ => 16 (1 call),
            => 2³ => 8 (2 calls),
            => 2² => 4 (4 calls),
            => 2¹ => 2 (8 calls),
            => 2⁰ => 1 (16 calls)
         */
        count(4);
    }

    static void count(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        count(num - 1);
        count(num - 1);
    }
}
