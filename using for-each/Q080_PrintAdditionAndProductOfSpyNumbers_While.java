public class Q080_PrintAdditionAndProductOfSpyNumbers_While {
    static boolean isSpy(int n) {
        n = Math.abs(n);
        int sum = 0;
        int product = 1;
        boolean hasDigit = false;

        while (n != 0) {
            hasDigit = true;
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }

        return hasDigit && sum == product;
    }

    public static void main(String[] args) {
        int[] a = { 1124, 123, 22, 124, 101 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isSpy(x)) {
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
