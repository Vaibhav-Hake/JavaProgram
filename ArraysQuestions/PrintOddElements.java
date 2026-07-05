public class PrintOddElements {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        boolean first = true;
        for (int x : a) {
            if (x % 2 != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
