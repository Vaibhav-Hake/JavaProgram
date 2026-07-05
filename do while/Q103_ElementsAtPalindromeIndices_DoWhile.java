public class Q103_ElementsAtPalindromeIndices_DoWhile {
    static boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;
        do {
            rev = rev * 10 + (num % 10);
            num /= 10;
        } while (num > 0);
        return rev == n;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };

        boolean first = true;
        int i = 0;
        do {
            if (isPalindrome(i)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
