public class AdditionAndProductOfSunnyNumbers_While {
    static int nextDigitSquareSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    static boolean isSunny(int n) {
        int x = Math.abs(n);
        int sqr = x * x;
        return sqr >= 0 && x == nextDigitSquareSum(sqr);
    }

    public static void main(String[] args) {
        int[] a = { 19, 2, 7, 20, 1, 9 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isSunny(a[i])) {
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
