public class SumOfFirstThreeElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        while (i < 3 && i < a.length) {
            sum += a[i];
            i++;
        }

        System.out.print(sum);
    }
}
