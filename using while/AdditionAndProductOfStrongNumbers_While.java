public class AdditionAndProductOfStrongNumbers_While {
    static int factorial(int n) {
        int res = 1;
        int i = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }

    static boolean isStrong(int n) {
        int x = Math.abs(n);
        int sum = 0;
        int original = x;
        while (x > 0) {
            int d = x % 10;
            sum += factorial(d);
            x /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int[] a = { 145, 92, 2, 40585 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isStrong(a[i])) {
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
