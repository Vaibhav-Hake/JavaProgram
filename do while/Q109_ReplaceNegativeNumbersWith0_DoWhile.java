public class Q109_ReplaceNegativeNumbersWith0_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, -5, 20, -30, 15 };

        int i = 0;
        do {
            if (a[i] < 0)
                a[i] = 0;
            i++;
        } while (i < a.length);

        boolean first = true;
        i = 0;
        do {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        } while (i < a.length);
    }
}
