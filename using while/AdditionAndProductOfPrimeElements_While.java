public class AdditionAndProductOfPrimeElements_While {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 7, 9, 11 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isPrime(a[i])) {
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
