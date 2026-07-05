public class Q100_AdditionAndSubtractionOfElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int add = 0;
        int sub = a[0];

        int i = 0;
        while (i < a.length) {
            add += a[i];
            if (i > 0)
                sub -= a[i];
            i++;
        }

        System.out.print("Addition=" + add + " Subtraction=" + sub);
    }
}
