public class SumOfLastThreeElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int n = a.length;
        int i = Math.max(0, n - 3);

        do {
            sum += a[i];
            i++;
        } while (i < n);

        System.out.print(sum);
    }
}
