public class Q117_ArrayContainsOnlyNegativeNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { -10, -25, -30, -45, -60 };

        boolean allNegative = true;
        int i = 0;
        do {
            if (a[i] >= 0) {
                allNegative = false;
                break;
            }
            i++;
        } while (i < a.length);

        if (allNegative)
            System.out.print("Array contains only negative numbers.");
        else
            System.out.print("Array does not contain only negative numbers.");
    }
}
