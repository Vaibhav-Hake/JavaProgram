public class HasMiddleElementOrNot_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        // For an odd length array, there is a single middle element.
        boolean hasMiddle = (a.length % 2 != 0);
        System.out.print(hasMiddle);
    }
}
