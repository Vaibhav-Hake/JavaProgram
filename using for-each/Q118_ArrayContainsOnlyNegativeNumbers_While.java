public class Q118_ArrayContainsOnlyNegativeNumbers_While {
    public static void main(String[] args) {
        int[] a = { -10, 20, -30, -40 };

        for (int x : a) {
            if (x >= 0) {
                System.out.print("Array contains non-negative number.");
                return;
            }
        }

        System.out.print("Array contains only negative numbers.");
    }
}
