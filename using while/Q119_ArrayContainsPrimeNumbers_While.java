public class Q119_ArrayContainsPrimeNumbers_While {
    static boolean isPrime(int n) {
        n = Math.abs(n);
        if (n < 2)
            return false;
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0)
                return false;
            d++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 12, 18, 25, 17, 30 };

        boolean anyPrime = false;
        int i = 0;
        while (i < a.length) {
            if (isPrime(a[i])) {
                anyPrime = true;
                break;
            }
            i++;
        }

        System.out.print(anyPrime ? "Array contains prime numbers." : "Array does not contain prime numbers.");
    }
}
