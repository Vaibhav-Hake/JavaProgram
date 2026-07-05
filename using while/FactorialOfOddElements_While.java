public class FactorialOfOddElements_While {
    static long factorial(int n) {
        long res = 1;
        int i = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] % 2 != 0) {
                long f = factorial(a[i]);
                if (!first)
                    System.out.print(" ");
                System.out.print(f);
                first = false;
            }
            i++;
        }
    }
}
