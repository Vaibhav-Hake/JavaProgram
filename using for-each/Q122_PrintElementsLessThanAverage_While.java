public class Q122_PrintElementsLessThanAverage_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };

        int sum = 0;
        for (int x : a)
            sum += x;
        double avg = (double) sum / a.length;

        boolean first = true;
        for (int x : a) {
            if (x < avg) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
        }
    }
}
