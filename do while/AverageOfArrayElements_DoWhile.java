public class AverageOfArrayElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);

        double avg = (double) sum / a.length;
        System.out.print(avg);
    }
}
