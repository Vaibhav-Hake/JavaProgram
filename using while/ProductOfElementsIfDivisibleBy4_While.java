public class ProductOfElementsIfDivisibleBy4_While {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (a[i] % 4 == 0) {
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
