public class Q124_PrintElementsBetweenTwoGivenNumbersReverse_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };
        int start = 20;
        int end = 70;

        boolean first = true;
        for (int i = a.length - 1; i >= 0; i--) {
            int x = a[i];
            if (x >= start && x <= end) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
