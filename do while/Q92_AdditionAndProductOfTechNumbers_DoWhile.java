public class Q92_AdditionAndProductOfTechNumbers_DoWhile {
    static boolean isTech(int n) {
        int num = Math.abs(n);
        int digits = 0;
        int temp = num;
        do {
            digits++;
            temp /= 10;
        } while (temp > 0);

        if (digits % 2 != 0)
            return false;

        int half = digits / 2;
        int pow = 1;
        for (int i = 0; i < half; i++)
            pow *= 10;

        int right = num % pow;
        int left = num / pow;
        int sum = left + right;

        long sq = 1L * sum * sum;
        return sq == num;
    }

    public static void main(String[] args) {
        int[] a = { 81, 9, 100, 2025, 10 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isTech(x)) {
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
