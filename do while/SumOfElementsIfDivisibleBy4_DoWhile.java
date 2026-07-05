public class SumOfElementsIfDivisibleBy4_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        int sum = 0;
        int i = 0;
        do {
            if (a[i] % 4 == 0) {
                sum += a[i];
            }
            i++;
        } while (i < a.length);

        System.out.print(sum);
    }
}
