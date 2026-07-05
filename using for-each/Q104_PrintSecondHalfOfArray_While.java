public class Q104_PrintSecondHalfOfArray_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        int half = a.length / 2;

        boolean first = true;
        for (int i = half; i < a.length; i++) {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
        }
    }
}
