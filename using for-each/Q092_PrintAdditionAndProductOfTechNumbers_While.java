public class Q092_PrintAdditionAndProductOfTechNumbers_While {
    static int digits(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static boolean isTech(int n) {
        n = Math.abs(n);
        int d = digits(n);
        if (d % 2 != 0)
            return false;
        int half = d / 2;
        int pow = 1;
        for (int i = 0; i < half; i++)
            pow *= 10;
        int left = n / pow;
        int right = n % pow;
        int sum = left + right;
        int sq = sum * sum;
        return sq == n;
    }

    public static void main(String[] args) {
        int[] a = { 2025, 81, 3025, 441, 10000 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isTech(x)) {
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
