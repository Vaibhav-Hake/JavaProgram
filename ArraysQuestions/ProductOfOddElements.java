public class ProductOfOddElements {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        long product = 1;
        for (int x : a) {
            if (x % 2 != 0) {
                product *= x;
            }
        }

        System.out.print(product);
    }
}
