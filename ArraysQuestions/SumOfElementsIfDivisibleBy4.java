public class SumOfElementsIfDivisibleBy4 {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        int sum = 0;
        for (int x : a) {
            if (x % 4 == 0) {
                sum += x;
            }
        }

        System.out.print(sum);
    }
}
