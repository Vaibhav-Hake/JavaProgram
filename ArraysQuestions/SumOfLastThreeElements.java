public class SumOfLastThreeElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int n = a.length;
        for (int i = Math.max(0, n - 3); i < n; i++) {
            sum += a[i];
        }

        System.out.print(sum);
    }
}
