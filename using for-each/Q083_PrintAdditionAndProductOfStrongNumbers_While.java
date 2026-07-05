public class Q083_PrintAdditionAndProductOfStrongNumbers_While {
    static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        n = Math.abs(n);
        int original = n;
        int sum = 0;
        if (n == 0)
            sum = fact(0) != 0 ? 0 : 0;
        while (n != 0) {
            int d = n % 10;
            sum += fact(d);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int[] a = { 145, 22, 2, 75 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isStrong(x)) {
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
