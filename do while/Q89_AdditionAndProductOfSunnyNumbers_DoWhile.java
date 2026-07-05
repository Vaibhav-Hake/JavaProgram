public class Q89_AdditionAndProductOfSunnyNumbers_DoWhile {
    static boolean isSunny(int n) {
        int num = Math.abs(n);
        if (num == 0)
            return false;
        int root = (int) Math.sqrt(num + 1);
        return root * root == num + 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 6, 8, 3 };

        int sum = 0;
        long product = 1;
        boolean found = false;

        int i = 0;
        do {
            int x = a[i];
            if (isSunny(x)) {
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
