public class Q073_CheckDivisibleBy3Or4FromIntArray_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };

        boolean first = true;
        for (int x : a) {
            if (x % 3 == 0 || x % 4 == 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
