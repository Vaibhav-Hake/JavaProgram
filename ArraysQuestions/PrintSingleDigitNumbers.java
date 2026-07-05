public class PrintSingleDigitNumbers {
    public static void main(String[] args) {
        int[] a = { 5, 12, 7, 145, 99, 3, 456 };

        boolean first = true;
        for (int x : a) {
            int abs = Math.abs(x);
            if (abs >= 0 && abs <= 9) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
