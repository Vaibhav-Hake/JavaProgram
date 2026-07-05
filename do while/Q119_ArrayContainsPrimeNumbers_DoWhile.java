public class Q119_ArrayContainsPrimeNumbers_DoWhile {
    static boolean isPrime(int n) {
        n = Math.abs(n);
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

        boolean anyPrime = false;
        int i = 0;
        do {
            if (isPrime(a[i])) {
                anyPrime = true;
                break;
            }
            i++;
        } while (i < a.length);

        if (anyPrime)
            System.out.print("Array contains prime numbers.");
        else
            System.out.print("Array does not contain prime numbers.");
    }
}
