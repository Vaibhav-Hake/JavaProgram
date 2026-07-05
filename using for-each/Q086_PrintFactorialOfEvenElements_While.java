public class Q086_PrintFactorialOfEvenElements_While {
    static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };

        boolean first = true;
        for (int x : a) {
            if (x % 2 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(fact(Math.abs(x)));
                first = false;
            }
        }
    }
}
