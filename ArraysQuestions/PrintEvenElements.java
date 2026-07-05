public class PrintEvenElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        boolean first = true;
        for (int x : a) {
            if (x % 2 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
