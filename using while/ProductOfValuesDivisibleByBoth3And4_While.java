public class ProductOfValuesDivisibleByBoth3And4_While {
    public static void main(String[] args) {
        int[] a = { 10, 12, 13, 15, 16, 20 };

        long product = 1;
        boolean found = false;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 3 == 0 && a[i] % 4 == 0) {
                product *= a[i];
                found = true;
            }
            i++;
        }

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
