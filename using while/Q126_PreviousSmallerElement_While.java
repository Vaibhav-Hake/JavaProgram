public class Q126_PreviousSmallerElement_While {
    static int prevSmaller(int[] a, int idx) {
        int j = idx - 1;
        while (j >= 0) {
            if (a[j] < a[idx])
                return a[j];
            j--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 10, 15, 8, 12, 20, 18 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int pse = prevSmaller(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(pse);
            first = false;
            i++;
        }
    }
}
