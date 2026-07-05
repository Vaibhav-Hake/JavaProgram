public class Q90_AdditionAndProductOfPerfectSquareNumbers_DoWhile {
    static boolean isPerfectSquare(int n) {
        if (n < 0)
            return false;
        int r = (int) Math.sqrt(n);
        return r * r == n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 9, 10 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isPerfectSquare(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
