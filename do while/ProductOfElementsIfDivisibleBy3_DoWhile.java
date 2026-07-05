public class ProductOfElementsIfDivisibleBy3_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            if (a[i] % 3 == 0) {
                product *= a[i];
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
