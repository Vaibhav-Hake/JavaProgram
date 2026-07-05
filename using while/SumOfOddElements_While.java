public class SumOfOddElements_While {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
            i++;
        }

        System.out.print(sum);
    }
}
