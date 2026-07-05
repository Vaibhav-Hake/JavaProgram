public class Q088_PrintAdditionAndProductOfPalindromeNumbers_While {
    static boolean isPalindrome(int n) {
        n = Math.abs(n);
        int original = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        int[] a = { 121, 15, 33, 44, 101 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isPalindrome(x)) {
                sum += x;
                product *= x;
                found = true;
            }
        }

        if (found)
            System.out.print(sum + " " + product);
        else
            System.out.print("0 0");
    }
}
