public class ProductOfEvenElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        long product = 1;
        int i = 0;
        boolean found = false;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
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
