public class AverageOfEvenElements_While {
    public static void main(String[] args) {
        int[] a = { 12, 15, 18, 21, 24, 27 };

        int sum = 0;
        int count = 0;

        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                sum += a[i];
                count++;
            }
            i++;
        }

        double avg = (count == 0) ? 0 : (double) sum / count;
        System.out.print(avg);
    }
}
