public class SumOfElementsIfDivisibleBy3 {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        int sum = 0;
        for (int x : a) {
            if (x % 3 == 0) {
                sum += x;
            }
        }

        System.out.print(sum);
    }
}
