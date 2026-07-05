public class Q124_NearestSmallerElementNextSmaller_While {
    static int nextSmaller(int[] a, int idx) {
        int j = idx + 1;
        while (j < a.length) {
            if (a[j] < a[idx])
                return a[j];
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 15, 10, 18, 12, 20, 8 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int nse = nextSmaller(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(nse);
            first = false;
            i++;
        }
    }
}
