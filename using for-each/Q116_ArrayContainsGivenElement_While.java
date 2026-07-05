public class Q116_ArrayContainsGivenElement_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int element = 40;

        boolean found = false;
        for (int x : a) {
            if (x == element) {
                found = true;
                break;
            }
        }

        System.out.print(found ? "Array contains element." : "Array does not contain element.");
    }
}
