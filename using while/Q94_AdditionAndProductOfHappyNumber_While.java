public class Q94_AdditionAndProductOfHappyNumber_While {
    static int next(int n) {
        int x = n;
        int sum = 0;
        while (x > 0) {
            int d = x % 10;
            sum += d * d;
            x /= 10;
        }
        return sum;
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = next(slow);
            fast = next(next(fast));
            if (slow == fast)
                break;
        }
        return slow == 1;
    }

    public static void main(String[] args) {
        int[] a = { 19, 2, 7, 20, 3 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            int x = a[i];
            if (isHappy(x)) {
                sum += x;
                product *= x;
                found = true;
            }
            i++;
        }
        if (!found)
            product = 0;
        System.out.print("Sum=" + sum + " Product=" + product);
    }
}
