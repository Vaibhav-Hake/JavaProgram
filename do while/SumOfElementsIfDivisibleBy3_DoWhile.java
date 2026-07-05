public class SumOfElementsIfDivisibleBy3_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        int sum = 0;
        int i = 0;
        do {
            if (a[i] % 3 == 0) {
                sum += a[i];
            }
            i++;
        } while (i < a.length);

        System.out.print(sum);
    }
}
