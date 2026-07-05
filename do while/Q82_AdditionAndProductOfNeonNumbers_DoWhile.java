public class Q82_AdditionAndProductOfNeonNumbers_DoWhile {
    static boolean isNeon(int n) {
        int num = Math.abs(n);
        long sq = 1L * num * num;
        int sumDigits = 0;
        while (sq > 0) {
            sumDigits += (sq % 10);
            sq /= 10;
        }
        return sumDigits == num;
    }

    public static void main(String[] args) {
        int[] a = { 9, 10, 12, 15, 2, 7 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isNeon(x)) {
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
