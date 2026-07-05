public class Q98_AdditionAndProductOfStrontioNumbers_DoWhile {
    static boolean isStrontio(int n) {
        // Not provided in your paste. Using placeholder definition: treat as Harshad
        // number.
        int num = Math.abs(n);
        if (num == 0)
            return false;
        int sumDigits = 0;
        int temp = num;
        do {
            sumDigits += temp % 10;
            temp /= 10;
        } while (temp > 0);
        return (num % sumDigits) == 0;
    }

    public static void main(String[] args) {
        int[] a = { 12, 18, 21, 22, 30 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isStrontio(x)) {
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
