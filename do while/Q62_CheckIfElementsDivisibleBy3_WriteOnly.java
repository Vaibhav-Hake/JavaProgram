public class Q62_CheckIfElementsDivisibleBy3_WriteOnly {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        boolean first = true;
        int i = 0;
        do {
            int x = a[i];
            if (x % 3 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
