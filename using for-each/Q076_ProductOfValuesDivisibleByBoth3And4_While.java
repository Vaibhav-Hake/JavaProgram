public class Q076_ProductOfValuesDivisibleByBoth3And4_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (x % 3 == 0 && x % 4 == 0) {
                product *= x;
                found = true;
            }
        }

        System.out.print(found ? product : 0);
    }
}
