public class PrintOddElements_While {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] % 2 != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
