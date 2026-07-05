public class Q63_CheckIfElementsDivisibleBy4_WriteOnly {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        boolean first = true;
        int i = 0;
        do {
            int x = a[i];
            if (x % 4 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
