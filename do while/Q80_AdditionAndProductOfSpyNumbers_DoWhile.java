public class Q80_AdditionAndProductOfSpyNumbers_DoWhile {
    static boolean isSpy(int n) {
        int num = Math.abs(n);
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        int[] a = { 22, 110, 101, 21, 9 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isSpy(x)) {
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
