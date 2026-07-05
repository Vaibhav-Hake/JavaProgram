public class Q91_AdditionAndProductOfDisariumNumbers_DoWhile {
    static int digits(int n) {
        int num = Math.abs(n);
        if (num == 0)
            return 1;
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }

    static boolean isDisarium(int n) {
        int num = Math.abs(n);
        int d = digits(num);
        int temp = num;
        long sum = 0;
        int p = d;
        while (temp > 0) {
            int digit = temp % 10;
            long pow = 1;
            for (int i = 0; i < p; i++)
                pow *= digit;
            sum += pow;
            temp /= 10;
            p--;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int[] a = { 89, 135, 88, 5, 175 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isDisarium(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
