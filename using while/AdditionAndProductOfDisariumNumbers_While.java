public class AdditionAndProductOfDisariumNumbers_While {
    static int digitCount(int n) {
        int c = 0;
        n = Math.abs(n);
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c == 0 ? 1 : c;
    }

    static int powInt(int base, int exp) {
        int res = 1;
        int i = 1;
        while (i <= exp) {
            res *= base;
            i++;
        }
        return res;
    }

    static boolean isDisarium(int n) {
        if (n < 0)
            n = -n;
        int digits = digitCount(n);
        int temp = n;
        int pos = digits;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += powInt(d, pos);
            pos--;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] a = { 135, 175, 89, 518, 1, 99 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isDisarium(a[i])) {
                sum += a[i];
                product *= a[i];
                found = true;
            }
            i++;
        }

        if (!found) {
            sum = 0;
            product = 0;
        }

        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
