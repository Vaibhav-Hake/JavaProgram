public class HasMiddleElementOrNot_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        // Middle element exists only for odd-length arrays.
        boolean hasMiddle = false;

        int i = 0;
        do {
            if (i == 0) {
                hasMiddle = (a.length % 2 != 0);
            }
            i++;
        } while (i < 1);

        System.out.print(hasMiddle);
    }
}
