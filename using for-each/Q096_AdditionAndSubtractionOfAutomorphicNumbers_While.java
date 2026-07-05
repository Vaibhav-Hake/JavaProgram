public class Q096_AdditionAndSubtractionOfAutomorphicNumbers_While {
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
        int[] a = { 1, 25, 2, 76, 3, 5 };

        int sum = 0;
        long sub = 0;
        boolean first = true;

        for (int x : a) {
            if (isAutomorphic(x)) {
                sum += x;
                if (first) {
                    sub = x;
                    first = false;
                } else {
                    sub -= x;
                }
            }
        }

        System.out.print(sum + " " + sub);
    }
}
