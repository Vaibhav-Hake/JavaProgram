public class NonZeroNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { 0, 10, 20, 0, 30, 40, 0, 50 };

        int i = 0;
        boolean first = true;
        do {
            if (a[i] != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
