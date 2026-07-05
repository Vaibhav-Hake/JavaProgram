public class Q115_ArrayContainsOnlyNegativeNumbers_While {
    public static void main(String[] args) {
        int[] a = { -10, -20, -30, -40, -50 };

        for (int x : a) {
            if (x >= 0) {
                System.out.print("Array does not contain only negative numbers.");
                return;
            }
        }

        System.out.print("Array contains only negative numbers.");
    }
}
