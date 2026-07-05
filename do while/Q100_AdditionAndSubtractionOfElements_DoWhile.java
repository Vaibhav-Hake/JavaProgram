public class Q100_AdditionAndSubtractionOfElements_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int add = 0;
        int sub = a[0];

        int i = 0;
        do {
            add += a[i];
            if (i > 0)
                sub -= a[i];
            i++;
        } while (i < a.length);

        System.out.print("Addition=" + add + " Subtraction=" + sub);
    }
}
