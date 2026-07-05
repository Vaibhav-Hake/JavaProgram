public class NonZeroNumbers {
    public static void main(String[] args) {
        int[] a = { 0, 10, 20, 0, 30, 40, 0, 50 };

        boolean first = true;
        for (int x : a) {
            if (x != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
