public class Q102_ElementsAtNonPrimeIndices_DoWhile {
    static boolean isPrimeIndex(int idx) {
        if (idx < 2)
            return false;
        for (int d = 2; d * d <= idx; d++) {
            if (idx % d == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        boolean first = true;
        int i = 0;
        do {
            if (!isPrimeIndex(i)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
