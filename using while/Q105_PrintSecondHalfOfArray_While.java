public class Q105_PrintSecondHalfOfArray_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80 };

        int half = a.length / 2;
        int i = half;
        boolean first = true;
        while (i < a.length) {
            if (!first)
                System.out.print(" ");
            System.out.print(a[i]);
            first = false;
            i++;
        }
    }
}
