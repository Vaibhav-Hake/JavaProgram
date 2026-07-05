public class Q110_ReplacePrimeNumbersWith100_DoWhile {
    static boolean isPrime(int n) {
        n = Math.abs(n);
        if (n < 2)
            return false;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 10, 11, 20, 23, 30 };

        int i = 0;
        do {
            if (isPrime(a[i]))
                a[i] = 100;
            i++;
        } while (i < a.length);

        boolean first = true;
        i = 0;
        do {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        } while (i < a.length);
    }
}
