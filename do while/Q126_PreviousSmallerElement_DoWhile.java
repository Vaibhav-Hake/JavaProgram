public class Q126_PreviousSmallerElement_DoWhile {
    static int prevSmaller(int[] a, int idx) {
        int j = idx - 1;
        do {
            if (a[j] < a[idx])
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
            int pse = prevSmaller(a, i);
            if (!first)
                System.out.print(" ");
            System.out.print(pse);
            first = false;
            i++;
        } while (i < a.length);
    }
}
