public class SumOfFirstThreeElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        do {
            if (i < a.length) {
                sum += a[i];
            }
            i++;
        } while (i < 3);

        System.out.print(sum);
    }
}
