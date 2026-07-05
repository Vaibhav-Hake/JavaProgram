public class Q125_PreviousGreaterElement_DoWhile {
    static int prevGreater(int[] a, int idx) {
        int j = idx - 1;
        do {
            if (a[j] > a[idx])
                return a[j];
            j--;
        } while (j >= 0);
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 8, 12, 20, 18 };

        boolean first = true;
        int i = 0;
        do {
            int pge = prevGreater(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(pge);
            first = false;
            i++;
        } while (i < a.length);
    }
}
