public class Q84_AdditionAndProductOfArmstrongNumbers_DoWhile {
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

    static boolean isArmstrong(int n) {
        int num = Math.abs(n);
        int d = digits(num);
        int temp = num;
        long sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            long p = 1;
            for (int i = 0; i < d; i++)
                p *= digit;
            sum += p;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int[] a = { 153, 371, 407, 12, 5 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isArmstrong(x)) {
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
