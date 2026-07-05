public class Q121_PrintElementsLessThanAverage_DoWhile {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };

        int sum = 0;
        int i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);

        double avg = (double) sum / a.length;

        boolean first = true;
        i = 0;
        do {
            if (a[i] < avg) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
