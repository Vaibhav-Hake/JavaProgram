public class Q124_NearestSmallerElementNextSmaller_DoWhile {
    static int nextSmaller(int[] a, int idx) {
        int j = idx + 1;
        do {
            if (a[j] < a[idx])
                return a[j];
            j++;
        } while (j < a.length);
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 15, 10, 18, 12, 20, 8 };

        boolean first = true;
        int i = 0;
        do {
            int nse = nextSmaller(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(nse);
            first = false;
            i++;
        } while (i < a.length);
    }
}
