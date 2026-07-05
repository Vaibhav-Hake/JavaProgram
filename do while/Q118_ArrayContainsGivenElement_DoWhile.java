public class Q118_ArrayContainsGivenElement_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int target = 40;

        boolean found = false;
        int i = 0;
        do {
            if (a[i] == target) {
                found = true;
                break;
            }
            i++;
        } while (i < a.length);

        System.out.print(found ? "Array contains " + target : "Array does not contain " + target);
    }
}
