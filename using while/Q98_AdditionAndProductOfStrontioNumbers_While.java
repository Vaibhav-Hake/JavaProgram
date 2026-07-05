public class Q98_AdditionAndProductOfStrontioNumbers_While {
    static boolean isStrontio(int n) {
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

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        while (i < a.length) {
            int x = a[i];
            if (isStrontio(x)) {
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
