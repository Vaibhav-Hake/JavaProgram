public class AdditionAndProductOfSpyNumbers_While {
    static int digitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int digitProduct(int n) {
        int prod = 1;
        n = Math.abs(n);
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }

    static boolean isSpy(int n) {
        if (n < 0)
            n = Math.abs(n);
        return digitSum(n) == digitProduct(n);
    }

    public static void main(String[] args) {
        int[] a = { 123, 22, 105, 55, 7 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isSpy(a[i])) {
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
