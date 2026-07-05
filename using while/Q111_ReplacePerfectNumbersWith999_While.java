public class Q111_ReplacePerfectNumbersWith999_While {
    static boolean isPerfect(int n) {
        n = Math.abs(n);
        if (n <= 1)
            return false;

        int sum = 1;
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0) {
                sum += d;
                int other = n / d;
                if (other != d)
                    sum += other;
            }
            d++;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] a = { 6, 10, 28, 12, 8 };

        int i = 0;
        while (i < a.length) {
            if (isPerfect(a[i]))
                a[i] = 999;
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
