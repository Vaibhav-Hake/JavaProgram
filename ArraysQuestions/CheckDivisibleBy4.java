public class CheckDivisibleBy4 {
    public static void main(String[] args) {
        int[] a = { 10, 16, 20, 24, 22 };

        for (int x : a) {
            if (x % 4 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
