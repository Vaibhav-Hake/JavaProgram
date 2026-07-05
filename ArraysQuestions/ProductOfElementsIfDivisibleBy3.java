public class ProductOfElementsIfDivisibleBy3 {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        long product = 1;
        boolean found = false;
        for (int x : a) {
            if (x % 3 == 0) {
                product *= x;
                found = true;
            }
        }

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
