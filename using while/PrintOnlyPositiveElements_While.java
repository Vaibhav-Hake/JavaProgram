public class PrintOnlyPositiveElements_While {
    public static void main(String[] args) {
        int[] a = { -10, 20, -30, 40, 50, -60 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] > 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
