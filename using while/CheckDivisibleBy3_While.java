public class CheckDivisibleBy3_While {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        int i = 0;
        while (i < a.length) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
            }
            i++;
        }
    }
}
