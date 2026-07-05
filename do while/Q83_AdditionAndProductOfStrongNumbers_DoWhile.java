public class Q83_AdditionAndProductOfStrongNumbers_DoWhile {
    static long fact(int d) {
        long f = 1;
        for (int i = 2; i <= d; i++)
            f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int num = Math.abs(n);
        int temp = num;
        long sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int[] a = { 145, 2, 40585, 123, 7 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isStrong(x)) {
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
