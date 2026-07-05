public class Q108_ReplaceNegativeNumbersWith0_While {
    public static void main(String[] args) {
        int[] a = { -10, 20, -30, 40, -50 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                a[i] = 0;
        }

        boolean first = true;
        for (int x : a) {
            if (!first)
                System.out.print(" ");
            System.out.print(x);
            first = false;
        }
    }
}
