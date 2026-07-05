public class Q110_ReplacePrimeNumbersWith100_While {
    static boolean isPrime(int n) {
        n = Math.abs(n);
        if (n < 2)
            return false;
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0)
                return false;
            d++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 10, 11, 20, 23, 30 };

        int i = 0;
        while (i < a.length) {
            if (isPrime(a[i]))
                a[i] = 100;
            i++;
        }

        i = 0;
        boolean first = true;
        while (i < a.length) {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        }
    }
}
