public class SumOfElementsAtOddIndex_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int i = 0;
        while (i < a.length) {
            if (i % 2 != 0) {
                sum += a[i];
            }
            i++;
        }

        System.out.print(sum);
    }
}
