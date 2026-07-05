public class Q097_PrintOnlyStrontioNumbers_While {
    static boolean isStrontio(int n) {
        // Strontio numbers are typically those whose (n^2) ends with n.
        // Using same automorphic definition.
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
        int[] a = { 1, 25, 76, 2, 5, 6 };

        boolean first = true;
        for (int x : a) {
            if (isStrontio(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
