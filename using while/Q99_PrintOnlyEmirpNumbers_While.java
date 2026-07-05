public class Q99_PrintOnlyEmirpNumbers_While {
    static boolean isPrime(int n) {
        int num = Math.abs(n);
        if (num < 2)
            return false;
        int d = 2;
        while (d * d <= num) {
            if (num % d == 0)
                return false;
            d++;
        }
        return true;
    }

    static int reverse(int n) {
        int num = Math.abs(n);
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
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

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int x = a[i];
            if (isEmirp(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        }
    }
}
