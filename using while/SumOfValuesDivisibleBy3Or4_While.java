public class SumOfValuesDivisibleBy3Or4_While {
    public static void main(String[] args) {
        int[] a = { 10, 12, 13, 15, 16, 20 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 3 == 0 || a[i] % 4 == 0) {
                sum += a[i];
            }
            i++;
        }

        System.out.print(sum);
    }
}
