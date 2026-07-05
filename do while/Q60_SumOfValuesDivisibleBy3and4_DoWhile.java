public class Q60_SumOfValuesDivisibleBy3and4_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 12, 15, 16, 20, 24, 22, 28 };

        int sum = 0;
        int i = 0;
        do {
            int x = a[i];
            if (x % 3 == 0 && x % 4 == 0) {
                sum += x;
            }
            i++;
        } while (i < a.length);

        System.out.print(sum);
    }
}
