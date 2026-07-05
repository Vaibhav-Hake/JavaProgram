public class AdditionAndProductOfArmstrongNumbers_While {
    static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static int pow(int base, int exp) {
        int res = 1;
        int i = 1;
        while (i <= exp) {
            res *= base;
            i++;
        }
        return res;
    }

    static boolean isArmstrong(int n) {
        int x = Math.abs(n);
        int digits = countDigits(x);
        int temp = x;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += pow(d, digits);
            temp /= 10;
        }
        return sum == x;
    }

    public static void main(String[] args) {
        int[] a = { 153, 370, 371, 407, 10 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isArmstrong(a[i])) {
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
