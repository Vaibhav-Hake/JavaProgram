public class Q089_PrintAdditionAndProductOfSunnyNumbers_While {
    static boolean isSunny(int n) {
        n = Math.abs(n);
        for (int x = 1; x * x <= n + 1; x++) {
            if (x * x == n + 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 4, 20, 1, 17, 26 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isSunny(x)) {
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
