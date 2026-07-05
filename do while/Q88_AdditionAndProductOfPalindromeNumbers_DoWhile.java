public class Q88_AdditionAndProductOfPalindromeNumbers_DoWhile {
    static int reverse(int n) {
        int num = Math.abs(n);
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        int num = Math.abs(n);
        return num == reverse(num);
    }

    public static void main(String[] args) {
        int[] a = { 121, 11, 22, 101, 123 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isPalindrome(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        } while (i < a.length);

        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
