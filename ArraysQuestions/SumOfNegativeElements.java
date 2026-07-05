public class SumOfNegativeElements {
    public static void main(String[] args) {
        int[] a = { -10, 20, -30, 40, -50 };

        int sum = 0;
        for (int x : a) {
            if (x < 0) {
                sum += x;
            }
        }

        System.out.print(sum);
    }
}
