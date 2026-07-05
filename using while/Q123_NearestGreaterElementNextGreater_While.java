public class Q123_NearestGreaterElementNextGreater_While {
    static int nextGreater(int[] a, int idx) {
        int j = idx + 1;
        while (j < a.length) {
            if (a[j] > a[idx])
                return a[j];
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 8, 12, 20, 18 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int nge = nextGreater(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(nge);
            first = false;
            i++;
        }
    }
}
