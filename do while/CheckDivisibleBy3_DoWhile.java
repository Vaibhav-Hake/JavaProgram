public class CheckDivisibleBy3_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        int i = 0;
        do {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
            }
            i++;
        } while (i < a.length);
    }
}
