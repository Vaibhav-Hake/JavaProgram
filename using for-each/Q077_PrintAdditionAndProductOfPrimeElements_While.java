public class Q077_PrintAdditionAndProductOfPrimeElements_While {
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
        int[] a = { 10, 11, 20, 21, 30, 31 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isPrime(x)) {
                sum += x;
                product *= x;
                found = true;
            }
        }

        if (found) {
            System.out.print(sum + " " + product);
        } else {
            System.out.print("0 0");
        }
    }
}
