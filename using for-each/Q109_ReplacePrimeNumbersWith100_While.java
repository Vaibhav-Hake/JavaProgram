public class Q109_ReplacePrimeNumbersWith100_While {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 12, 18, 25, 17, 30 };

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]))
                a[i] = 100;
        }

        boolean first = true;
        for (int x : a) {
            if (!first)
                System.out.print(" ");
            System.out.print(x);
            first = false;
        }
    }
}
