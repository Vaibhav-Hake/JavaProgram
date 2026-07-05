public class Q095_PrintOnlyAutomorphicNumbers_While {
    static boolean isAutomorphic(int n) {
        n = Math.abs(n);
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        if (digits == 0)
            digits = 1;
        int pow = 1;
        for (int i = 0; i < digits; i++)
            pow *= 10;
        long sq = (long) n * n;
        return sq % pow == n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 25, 76, 89 };

        boolean first = true;
        for (int x : a) {
            if (isAutomorphic(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
