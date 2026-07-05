public class Q96_AdditionAndSubtractionOfAutomorphicNumbers_While {
    static boolean isAutomorphic(int n) {
        int num = Math.abs(n);
        long sq = 1L * num * num;

        long mod = 1;
        int temp = num;
        while (temp > 0) {
            mod *= 10;
            temp /= 10;
        }
        return sq % mod == num;
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 25, 76, 21, 52 };

        int add = 0;
        int sub = 0;
        boolean first = true;

        int i = 0;
        while (i < a.length) {
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
        }

        System.out.print("Addition=" + add + " Subtraction=" + sub);
    }
}
