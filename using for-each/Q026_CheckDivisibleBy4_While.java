public class Q026_CheckDivisibleBy4_While {
    public static void main(String[] args) {
        int[] a = { 12, 16, 18, 20, 25 };

        for (int x : a) {
            if (x % 4 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
