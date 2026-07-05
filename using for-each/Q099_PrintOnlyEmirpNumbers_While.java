public class Q099_PrintOnlyEmirpNumbers_While {
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

    static int reverse(int n) {
        n = Math.abs(n);
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] a = { 13, 17, 31, 37, 79, 97, 11 };

        boolean first = true;
        for (int x : a) {
            int r = reverse(x);
            if (isPrime(x) && isPrime(r) && r != x) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
