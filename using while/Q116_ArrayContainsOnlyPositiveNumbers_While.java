public class Q116_ArrayContainsOnlyPositiveNumbers_While {
    public static void main(String[] args) {
        int[] a = { 10, 25, 30, 45, 60 };

        boolean allPositive = true;
        int i = 0;
        while (i < a.length) {
            if (a[i] <= 0) {
                allPositive = false;
                break;
            }
            i++;
        }

        if (allPositive)
            System.out.print("Array contains only positive numbers.");
        else
            System.out.print("Array does not contain only positive numbers.");
    }
}
