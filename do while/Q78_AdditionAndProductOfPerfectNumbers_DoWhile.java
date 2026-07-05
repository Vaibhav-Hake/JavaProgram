public class Q78_AdditionAndProductOfPerfectNumbers_DoWhile {
    static boolean isPerfect(int n) {
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
        int[] a = { 6, 10, 28, 12, 496 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isPerfect(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
