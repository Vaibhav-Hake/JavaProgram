public class Q122_PrintElementsBetweenTwoGivenNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };
        int start = 20;
        int end = 70;

        boolean first = true;
        int i = 0;
        do {
            if (a[i] >= start && a[i] <= end) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
