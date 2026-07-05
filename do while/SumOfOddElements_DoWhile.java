public class SumOfOddElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        int sum = 0;
        int i = 0;
        do {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
            i++;
        } while (i < a.length);

        System.out.print(sum);
    }
}
