public class PrintDataDivisibleBy3Or4_While {
    public static void main(String[] args) {
        int[] a = { 10, 12, 13, 15, 16, 20 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] % 3 == 0 || a[i] % 4 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
