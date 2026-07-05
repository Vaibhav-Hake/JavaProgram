public class Q107_ReplaceAllOddElementsWithMinus1_While {
    public static void main(String[] args) {
        int[] a = { 10, 21, 20, 33, 40, 55 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                a[i] = -1;
        }

        boolean first = true;
        for (int x : a) {
            if (!first)
                System.out.print(" ");
            System.out.print(x);
            first = false;
        }
    }
}
