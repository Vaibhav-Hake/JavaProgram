public class Q108_ReplaceOddElementsWithMinus1_While {
    public static void main(String[] args) {
        int[] a = { 10, 21, 30, 41, 50 };

        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 != 0)
                a[i] = -1;
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
