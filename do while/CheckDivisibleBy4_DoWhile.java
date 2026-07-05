public class CheckDivisibleBy4_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        int i = 0;
        do {
            if (a[i] % 4 == 0) {
                System.out.print(a[i] + " ");
            }
            i++;
        } while (i < a.length);
    }
}
