public class Q094_PrintAdditionAndProductOfHappyNumbers2_While {
    static int next(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n != 0) {
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = next(slow);
            fast = next(next(fast));
            if (slow == 1 || fast == 1)
                return true;
            if (slow == fast)
                return false;
        }
    }

    public static void main(String[] args) {
        int[] a = { 19, 2, 7, 20, 1 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isHappy(x)) {
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
