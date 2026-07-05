public class Q110_IncrementEachElementBy1_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40 };

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
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
