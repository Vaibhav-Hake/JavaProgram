public class AverageOfArrayElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }

        double avg = (double) sum / a.length;
        System.out.print(avg);
    }
}
