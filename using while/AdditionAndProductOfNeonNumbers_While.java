public class AdditionAndProductOfNeonNumbers_While {
    static boolean isNeon(int n) {
        n = Math.abs(n);
        int sq = n * n;
        int sumDigits = 0;
        while (sq > 0) {
            sumDigits += sq % 10;
            sq /= 10;
        }
        return sumDigits == n;
    }

    public static void main(String[] args) {
        int[] a = { 9, 10, 12, 15, 14, 7 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isNeon(a[i])) {
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
