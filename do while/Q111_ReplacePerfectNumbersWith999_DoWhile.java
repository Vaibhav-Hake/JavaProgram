public class Q111_ReplacePerfectNumbersWith999_DoWhile {
    static boolean isPerfect(int n) {
        n = Math.abs(n);
        if (n <= 1)
            return false;
        int sum = 1;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                sum += d;
                int other = n / d;
                if (other != d)
                    sum += other;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] a = { 6, 10, 28, 12, 8 };

        int i = 0;
        do {
            if (isPerfect(a[i]))
                a[i] = 999;
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
