public class Q59_PrintOnlyElementsDivisibleBy3or4_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 12, 15, 16, 20, 24, 22, 28 };

        boolean first = true;
        int i = 0;
        do {
            int x = a[i];
            if (x % 3 == 0 || x % 4 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
