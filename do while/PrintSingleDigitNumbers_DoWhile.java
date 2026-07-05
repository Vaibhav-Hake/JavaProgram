public class PrintSingleDigitNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { 5, 12, 7, 145, 99, 3, 456 };

        int i = 0;
        boolean first = true;
        do {
            int abs = Math.abs(a[i]);
            if (abs <= 9) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
