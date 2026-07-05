public class Q95_PrintOnlyAutomorphicNumbers_While {
    static boolean isAutomorphic(int n) {
        int num = Math.abs(n);
        long sq = 1L * num * num;

        long mod = 1;
        int temp = num;
        while (temp > 0) {
            mod *= 10;
            temp /= 10;
        }
        return sq % mod == num;
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 25, 76, 21, 52 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int x = a[i];
            if (isAutomorphic(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        }
    }
}
