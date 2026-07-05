public class Q93_AdditionAndProductOfEvilNumbers_While {
    static boolean isEvil(int n) {
        int num = Math.abs(n);
        int countEvenDigits = 0;
        int temp = num;
        if (temp == 0)
            return false;

        while (temp > 0) {
            int d = temp % 10;
            if (d % 2 == 0)
                countEvenDigits++;
            temp /= 10;
        }
        return countEvenDigits % 2 == 0;
    }

    public static void main(String[] args) {
        int[] a = { 12, 22, 135, 246, 11 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            int x = a[i];
            if (isEvil(x)) {
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
