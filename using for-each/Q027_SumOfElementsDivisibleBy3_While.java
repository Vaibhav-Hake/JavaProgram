public class Q027_SumOfElementsDivisibleBy3_While {
    public static void main(String[] args) {
        int[] a = { 12, 45, 18, 60, 35, 75, 28, 90, 50 };
        int sum = 0;

        for (int x : a) {
            if (x % 3 == 0) {
                sum += x;
            }
        }

        System.out.print(sum);
    }
}
