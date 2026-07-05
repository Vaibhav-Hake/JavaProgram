public class Q120_PrintElementsGreaterThanAverage_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }

        double avg = (double) sum / a.length;

        i = 0;
        boolean first = true;
        while (i < a.length) {
            if (a[i] > avg) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
