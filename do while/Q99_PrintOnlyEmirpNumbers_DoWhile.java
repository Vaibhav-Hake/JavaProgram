public class Q99_PrintOnlyEmirpNumbers_DoWhile {
    static boolean isPrime(int n) {
        int num = Math.abs(n);
        if (num < 2)
            return false;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0)
                return false;
        }
        return true;
    }

    static int reverse(int n) {
        int num = Math.abs(n);
        int rev = 0;
        do {
            rev = rev * 10 + (num % 10);
            num /= 10;
        } while (num > 0);
        return rev;
    }

    static boolean isEmirp(int n) {
        if (!isPrime(n))
            return false;
        int r = reverse(n);
        return r != Math.abs(n) && isPrime(r);
    }

    public static void main(String[] args) {
        int[] a = { 13, 17, 31, 19, 23, 101, 11, 10 };

        boolean first = true;
        int i = 0;
        do {
            int x = a[i];
            if (isEmirp(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
