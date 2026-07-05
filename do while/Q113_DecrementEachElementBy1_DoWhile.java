public class Q113_DecrementEachElementBy1_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int i = 0;
        do {
            a[i] = a[i] - 1;
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
