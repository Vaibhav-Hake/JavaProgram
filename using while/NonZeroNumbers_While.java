public class NonZeroNumbers_While {
    public static void main(String[] args) {
        int[] a = { 0, 10, 20, 0, 30, 40, 0, 50 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
