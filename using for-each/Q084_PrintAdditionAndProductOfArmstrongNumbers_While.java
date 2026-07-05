public class Q084_PrintAdditionAndProductOfArmstrongNumbers_While {
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

    static boolean isArmstrong(int n) {
        int d = digits(n);
        int original = n;
        n = Math.abs(n);
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            int p = 1;
            for (int i = 0; i < d; i++)
                p *= r;
            sum += p;
            n /= 10;
        }
        return sum == Math.abs(original);
    }

    public static void main(String[] args) {
        int[] a = { 153, 371, 5, 123, 407 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isArmstrong(x)) {
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
