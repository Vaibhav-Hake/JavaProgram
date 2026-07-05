public class Q97_PrintOnlyStrontioNumbers_While {
    static boolean isStrontio(int n) {
        // Placeholder: not provided in task.
        int num = Math.abs(n);
        if (num == 0)
            return false;
        int sumDigits = 0;
        int temp = num;
        while (temp > 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }
        return (num % sumDigits) == 0;
    }

    public static void main(String[] args) {
        int[] a = { 12, 18, 21, 22, 30 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int x = a[i];
            if (isStrontio(x)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        }
    }
}
