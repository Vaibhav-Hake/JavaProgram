public class AdditionAndProductOfPalindromeNumbers_While {
    static boolean isPalindrome(int n) {
        int x = Math.abs(n);
        int rev = 0;
        int temp = x;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        int[] a = { 121, 33, 44, 56, 989 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            if (isPalindrome(a[i])) {
                sum += a[i];
                product *= a[i];
                found = true;
            }
            i++;
        }

        if (!found) {
            sum = 0;
            product = 0;
        }

        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
