public class Q86_PrintOnlyFactorialOfEvenElements_DoWhile {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6 };

        int i = 0;
        boolean first = true;
        do {
            int x = a[i];
            if (x % 2 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(fact(Math.abs(x)));
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
