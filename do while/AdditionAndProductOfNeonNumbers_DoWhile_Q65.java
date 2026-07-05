public class AdditionAndProductOfNeonNumbers_DoWhile_Q65 {
    static int digitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isNeon(int n) {
        n = Math.abs(n);
        int sq = n * n;
        int lastDigit = sq % 10;
        return lastDigit == n ? digitSum(sq) == n : false;
    }

    public static void main(String[] args) {
        int[] a = { 9, 10, 12, 15, 14, 7 };

        int i = 0;
        int sum = 0;
        long product = 1;
        boolean found = false;

        do {
            if (isNeon(a[i])) {
                sum += a[i];
                product *= a[i];
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
