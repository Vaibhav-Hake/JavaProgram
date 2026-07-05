public class Q093_PrintAdditionAndProductOfEvilNumbers_While {
    static int evenDigitCount(int n) {
        n = Math.abs(n);
        int c = 0;
        if (n == 0)
            return 1;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0)
                c++;
            n /= 10;
        }
        return c;
    }

    static boolean isEvil(int n) {
        return evenDigitCount(n) % 2 == 0;
    }

    public static void main(String[] args) {
        int[] a = { 122, 22, 1356, 2468, 99 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isEvil(x)) {
                sum += x;
                product *= x;
                found = true;
            }
        }

        if (found)
            System.out.print(sum + " " + product);
        else
            System.out.print("0 0");
    }
}
