public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        for (int x : a) {
            sum += x;
        }

        double avg = (double) sum / a.length;
        System.out.print(avg);
    }
}
