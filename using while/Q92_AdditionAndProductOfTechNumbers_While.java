public class Q92_AdditionAndProductOfTechNumbers_While {
    static boolean isTech(int n) {
        int num = Math.abs(n);
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        if (digits == 0)
            return false;

        if (digits % 2 != 0)
            return false;

        int half = digits / 2;
        int pow = 1;
        int i = 0;
        while (i < half) {
            pow *= 10;
            i++;
        }

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
        while (i < a.length) {
            int x = a[i];
            if (isTech(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        }
        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
