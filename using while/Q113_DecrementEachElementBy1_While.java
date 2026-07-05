public class Q113_DecrementEachElementBy1_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int i = 0;
        while (i < a.length) {
            a[i] = a[i] - 1;
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
