public class Q116_ArrayContainsOnlyPositiveNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 25, 30, 45, 60 };

        boolean allPositive = true;
        int i = 0;
        do {
            if (a[i] <= 0) {
                allPositive = false;
                break;
            }
            i++;
        } while (i < a.length);

        if (allPositive)
            System.out.print("Array contains only positive numbers.");
        else
            System.out.print("Array does not contain only positive numbers.");
    }
}
