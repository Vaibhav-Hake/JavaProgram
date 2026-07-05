public class AdditionAndProductOfPerfectNumbers_While {
    static boolean isPerfect(int n) {
        if (n <= 1)
            return false;
        int sum = 1;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i && other != n)
                    sum += other;
            }
            i++;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] a = { 6, 28, 12, 496, 10 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isPerfect(a[i])) {
                sum += a[i];
                product *= a[i];
                found = true;
            }
            i++;
        }

        if (!found) {
            sum = 0;
            product = 0;
        }

        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
