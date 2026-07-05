public class Q96_AdditionAndSubtractionOfAutomorphicNumbers_DoWhile {
    static boolean isAutomorphic(int n) {
        int num = Math.abs(n);
        long sq = 1L * num * num;
        long mod = 1;
        int temp = num;
        do {
            mod *= 10;
            temp /= 10;
        } while (temp > 0);
        return (sq % mod) == num;
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 25, 76, 21, 52 };

        int add = 0;
        int sub = 0;
        boolean first = true;

        int i = 0;
        do {
            int x = a[i];
            if (isAutomorphic(x)) {
                add += x;
                if (first) {
                    sub = x;
                    first = false;
                } else {
                    sub -= x;
                }
            }
            i++;
        } while (i < a.length);

        System.out.print("Addition=" + add + " Subtraction=" + sub);
    }
}
