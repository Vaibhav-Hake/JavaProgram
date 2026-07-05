public class Q117_ArrayContainsPrimeNumbers_While {
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

        for (int x : a) {
            if (isPrime(x)) {
                System.out.print("Array contains prime numbers.");
                return;
            }
        }

        System.out.print("Array does not contain prime numbers.");
    }
}
