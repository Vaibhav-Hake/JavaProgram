public class Q012_AvgOfOddElements_While {
    public static void main(String[] args) {
        int[] a = { 12, 15, 18, 21, 24, 27 };

        int sum = 0;
        int count = 0;

        for (int x : a) {
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }

        double avg = (double) sum / count;
        System.out.print(avg);
    }
}
