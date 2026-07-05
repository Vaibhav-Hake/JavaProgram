public class ProductOfElementsIfDivisibleBy4 {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        long product = 1;
        boolean found = false;
        for (int x : a) {
            if (x % 4 == 0) {
                product *= x;
                found = true;
            }
        }

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
