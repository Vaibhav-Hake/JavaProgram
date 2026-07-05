public class SumOfFirstThreeElements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        for (int i = 0; i < 3 && i < a.length; i++) {
            sum += a[i];
        }

        System.out.print(sum);
    }
}
