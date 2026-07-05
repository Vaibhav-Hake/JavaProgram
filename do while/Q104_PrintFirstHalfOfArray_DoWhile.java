public class Q104_PrintFirstHalfOfArray_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };

        int half = a.length / 2;
        int i = 0;
        do {
            System.out.print((i == 0 ? "" : " ") + a[i]);
            i++;
        } while (i < half);
    }
}
