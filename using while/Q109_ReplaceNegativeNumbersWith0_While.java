public class Q109_ReplaceNegativeNumbersWith0_While {
    public static void main(String[] args) {
        int[] a = { 10, -5, 20, -30, 15 };

        int i = 0;
        while (i < a.length) {
            if (a[i] < 0)
                a[i] = 0;
            i++;
        }

        i = 0;
        boolean first = true;
        while (i < a.length) {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        }
    }
}
