public class Q76_ProductOfValuesDivisibleByBoth3And4_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 12, 15, 16, 20, 24, 22, 28, 36 };

        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (x % 3 == 0 && x % 4 == 0) {
                product *= x;
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
