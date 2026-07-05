public class Q93_AdditionAndProductOfEvilNumbers_DoWhile {
    static boolean isEvil(int n) {
        int num = Math.abs(n);
        int countEvenDigits = 0;
        int temp = num;
        do {
            int d = temp % 10;
            if (d % 2 == 0)
                countEvenDigits++;
            temp /= 10;
        } while (temp > 0);
        return countEvenDigits % 2 == 0; // typical definition for "evil" as even number of even digits
    }

    public static void main(String[] args) {
        int[] a = { 12, 22, 135, 246, 11 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isEvil(x)) {
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
