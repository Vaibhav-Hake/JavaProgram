public class Q078_PrintAdditionAndProductOfPerfectNumbers_While {
    static boolean isPerfect(int n) {
        if (n <= 1)
            return false;
        int sum = 1;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                sum += d;
                int q = n / d;
                if (q != d)
                    sum += q;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] a = { 6, 10, 28, 33, 496, 12 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isPerfect(x)) {
                sum += x;
                product *= x;
                found = true;
            }
        }

        if (found)
            System.out.print(sum + " " + product);
        else
            System.out.print("0 0");
    }
}
