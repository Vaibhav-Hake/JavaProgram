public class Q098_AdditionAndProductOfStrontioNumbers_While {
    static boolean isStrontio(int n) {
        n = Math.abs(n);
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        if (digits == 0)
            digits = 1;
        int pow = 1;
        for (int i = 0; i < digits; i++)
            pow *= 10;
        long sq = (long) n * n;
        return sq % pow == n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 25, 76, 2, 5, 6 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isStrontio(x)) {
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
