public class Q120_ArrayContainsPrimeNumbers2_While {
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

        boolean hasPrime = false;
        for (int x : a) {
            if (isPrime(x)) {
                hasPrime = true;
                break;
            }
        }

        System.out.print(hasPrime ? "Array contains prime numbers." : "Array does not contain prime numbers.");
    }
}
