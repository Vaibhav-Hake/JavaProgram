public class AdditionAndProductOfHarshadNumbers_While {
    static int digitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isHarshad(int n) {
        if (n == 0)
            return false;
        int sum = digitSum(n);
        return sum != 0 && (n % sum == 0);
    }

    public static void main(String[] args) {
        int[] a = { 18, 21, 20, 42, 100 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isHarshad(a[i])) {
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
