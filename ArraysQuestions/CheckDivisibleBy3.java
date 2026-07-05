public class CheckDivisibleBy3 {
    public static void main(String[] args) {
        int[] a = { 10, 15, 20, 21, 22 };

        for (int x : a) {
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
