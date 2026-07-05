public class Q103_ElementsAtPalindromeIndices_While {
    static boolean isPalindromeIndex(int idx) {
        int n = idx;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == idx;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            if (isPalindromeIndex(i)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        }
    }
}
