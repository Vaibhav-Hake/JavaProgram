public class ProductOfEvenElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            if (a[i] % 2 == 0) {
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
