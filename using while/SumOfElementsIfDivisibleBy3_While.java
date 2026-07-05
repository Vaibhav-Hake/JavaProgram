public class SumOfElementsIfDivisibleBy3_While {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 3 == 0) {
                sum += a[i];
            }
            i++;
        }

        System.out.print(sum);
    }
}
