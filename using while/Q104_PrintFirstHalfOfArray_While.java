public class Q104_PrintFirstHalfOfArray_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };

        int half = a.length / 2;
        int i = 0;
        boolean first = true;
        while (i < half) {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        }
    }
}
