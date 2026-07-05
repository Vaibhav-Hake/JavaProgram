public class Q082_PrintAdditionAndProductOfNeonNumbers_While {
    static boolean isNeon(int n) {
        n = Math.abs(n);
        int sq = n * n;
        int last = sq % 10;
        return last == n;
    }

    public static void main(String[] args) {
        int[] a = { 9, 1, 81, 8, 20 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isNeon(x)) {
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
