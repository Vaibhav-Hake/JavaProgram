public class Q091_PrintAdditionAndProductOfDisariumNumbers_While {
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

    static boolean isDisarium(int n) {
        int d = digits(n);
        n = Math.abs(n);
        int original = n;
        int sum = 0;
        int i = 0;
        // We need powers from d down to 1
        while (n != 0) {
            int digit = n % 10;
            int power = d - i;
            int p = 1;
            for (int k = 0; k < power; k++)
                p *= digit;
            sum += p;
            n /= 10;
            i++;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int[] a = { 175, 518, 89, 135 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isDisarium(x)) {
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
