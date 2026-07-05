public class SumOfElementsAtOddIndex_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        do {
            if (i % 2 != 0) {
                sum += a[i];
            }
            i++;
        } while (i < a.length);

        System.out.print(sum);
    }
}
