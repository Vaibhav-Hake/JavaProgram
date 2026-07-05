public class Q81_AdditionAndProductOfHarshadNumbers_DoWhile {
    static boolean isHarshad(int n) {
        int num = Math.abs(n);
        if (num == 0)
            return false;

        int sumDigits = 0;
        int temp = num;
        while (temp > 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }
        return (sumDigits != 0) && (num % sumDigits == 0);
    }

    public static void main(String[] args) {
        int[] a = { 12, 18, 21, 22, 30 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isHarshad(x)) {
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
