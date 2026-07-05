public class Q114_ArrayContainsOnlyPositiveNumbers_While {
    public static void main(String[] args) {
        int[] a = { 10, 25, 30, 45, 60 };

        for (int x : a) {
            if (x <= 0) {
                System.out.print("Array does not contain only positive numbers.");
                return;
            }
        }

        System.out.print("Array contains only positive numbers.");
    }
}
