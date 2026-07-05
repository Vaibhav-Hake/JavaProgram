public class ProductOfAllElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        long product = 1;
        int i = 0;
        while (i < a.length) {
            product *= a[i];
            i++;
        }

        System.out.print(product);
    }
}
