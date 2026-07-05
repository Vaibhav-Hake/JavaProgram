public class Q119_ArrayContainsGivenElement2_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 20, 40 };
        int element = 30;

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
