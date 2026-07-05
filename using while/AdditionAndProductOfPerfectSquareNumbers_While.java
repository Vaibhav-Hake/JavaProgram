public class AdditionAndProductOfPerfectSquareNumbers_While {
    static boolean isPerfectSquare(int n) {
        if (n < 0)
            return false;
        int i = 0;
        while (i * i < n)
            i++;
        return i * i == n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 9, 10, 16, 20 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isPerfectSquare(a[i])) {
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
