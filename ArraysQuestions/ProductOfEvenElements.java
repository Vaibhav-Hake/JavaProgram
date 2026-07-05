public class ProductOfEvenElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        long product = 1;
        for (int x : a) {
            if (x % 2 == 0) {
                product *= x;
            }
        }

        System.out.print(product);
    }
}
