public class Q090_PrintAdditionAndProductOfPerfectSquareNumbers_While {
    static boolean isPerfectSquare(int n) {
        n = Math.abs(n);
        int r = (int) Math.sqrt(n);
        return r * r == n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 9, 10, 16 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isPerfectSquare(x)) {
                sum += x;
                product *= x;
                found = true;
            }
        }

        if (found)
            System.out.print(sum + " " + product);
        else
            System.out.print("0 0");
    }
}
