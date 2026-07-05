public class Q123_NearestGreaterElementNextGreater_DoWhile {
    static int nextGreater(int[] a, int idx) {
        int j = idx + 1;
        do {
            if (a[j] > a[idx])
                return a[j];
            j++;
        } while (j < a.length);
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 8, 12, 20, 18 };

        boolean first = true;
        int i = 0;
        do {
            int nge = nextGreater(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(nge);
            first = false;
            i++;
        } while (i < a.length);
    }
}
