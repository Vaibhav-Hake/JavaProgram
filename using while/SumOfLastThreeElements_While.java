public class SumOfLastThreeElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int n = a.length;
        int i = Math.max(0, n - 3);
        while (i < n) {
            sum += a[i];
            i++;
        }

        System.out.print(sum);
    }
}
