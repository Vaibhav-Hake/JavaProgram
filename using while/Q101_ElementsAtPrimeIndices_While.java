public class Q101_ElementsAtPrimeIndices_While {
    static boolean isPrimeIndex(int idx) {
        if (idx < 2)
            return false;
        int d = 2;
        while (d * d <= idx) {
            if (idx % d == 0)
                return false;
            d++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (isPrimeIndex(i)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
