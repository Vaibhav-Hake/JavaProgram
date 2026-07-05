public class Q022_PrintOnlyNegativeElements_While {
    public static void main(String[] args) {
        int[] a = { -10, 20, -30, 40, 50, -60 };

        boolean first = true;
        for (int x : a) {
            if (x < 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
