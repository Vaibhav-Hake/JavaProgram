public class Q013_CheckMiddleElementOrNot_While {
    static boolean hasMiddle(int[] a) {
        return a != null && a.length > 0;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        if (hasMiddle(a)) {
            System.out.print("Array has middle element");
        } else {
            System.out.print("Array does not have middle element");
        }
    }
}
