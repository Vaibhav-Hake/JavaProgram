public class Q108_ReplaceOddElementsWithMinus1_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 21, 30, 41, 50 };

        int i = 0;
        do {
            if (a[i] % 2 != 0)
                a[i] = -1;
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
