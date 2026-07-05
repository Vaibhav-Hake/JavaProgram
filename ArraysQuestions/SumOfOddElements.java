public class SumOfOddElements {
    public static void main(String[] args) {
        int[] a = { 11, 20, 33, 40, 55 };

        int sum = 0;
        for (int x : a) {
            if (x % 2 != 0) {
                sum += x;
            }
        }

        System.out.print(sum);
    }
}
