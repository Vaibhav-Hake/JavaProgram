public class Q023_PrintOnlyBuzzNumbers_While {
    static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        int[] a = { 14, 27, 35, 42, 50, 67, 89 };

        boolean first = true;
        for (int x : a) {
            if (isBuzz(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
