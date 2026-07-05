public class ProductOfAllElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        long product = 1;
        for (int x : a) {
            product *= x;
        }

        System.out.print(product);
    }
}
