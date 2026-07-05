public class SumOfAllElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        for (int x : a) {
            sum += x;
        }

        System.out.print(sum);
    }
}
