public class Q017_ProductOfOddElements_While {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (x % 2 != 0) {
                product *= x;
                found = true;
            }
        }

        if (found) {
            System.out.print(product);
        } else {
            System.out.print(0);
        }
    }
}
