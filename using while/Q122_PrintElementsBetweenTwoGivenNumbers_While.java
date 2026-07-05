public class Q122_PrintElementsBetweenTwoGivenNumbers_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };
        int start = 20;
        int end = 70;

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] >= start && a[i] <= end) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
