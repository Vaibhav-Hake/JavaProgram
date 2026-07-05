public class SumOfElementsIfDivisibleBy4_While {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 4 == 0) {
                sum += a[i];
            }
            i++;
        }

        System.out.print(sum);
    }
}
