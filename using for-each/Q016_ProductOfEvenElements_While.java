public class Q016_ProductOfEvenElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (x % 2 == 0) {
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
