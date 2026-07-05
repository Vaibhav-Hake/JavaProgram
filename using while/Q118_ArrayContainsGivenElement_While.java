public class Q118_ArrayContainsGivenElement_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int target = 40;

        boolean found = false;
        int i = 0;
        while (i < a.length) {
            if (a[i] == target) {
                found = true;
                break;
            }
            i++;
        }

        System.out.print(found ? "Array contains " + target : "Array does not contain " + target);
    }
}
