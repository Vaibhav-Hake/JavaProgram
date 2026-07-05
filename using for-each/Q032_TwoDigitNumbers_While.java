public class Q032_TwoDigitNumbers_While {
    public static void main(String[] args) {
        int[] a = { 5, 12, 7, 145, 99, 3, 456 };

        boolean first = true;
        for (int x : a) {
            if (x >= 10 && x <= 99) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
