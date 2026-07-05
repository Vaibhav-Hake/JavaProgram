public class Q025_CheckDivisibleBy3_While {
    public static void main(String[] args) {
        int[] a = { 12, 15, 18, 21, 25 };

        for (int x : a) {
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
