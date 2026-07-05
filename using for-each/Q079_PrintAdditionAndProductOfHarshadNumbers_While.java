public class Q079_PrintAdditionAndProductOfHarshadNumbers_While {
    static int digitSum(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    static boolean isHarshad(int n) {
        if (n == 0)
            return true;
        int s = digitSum(n);
        return s != 0 && n % s == 0;
    }

    public static void main(String[] args) {
        int[] a = { 18, 21, 10, 12, 42, 7 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        for (int x : a) {
            if (isHarshad(x)) {
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
