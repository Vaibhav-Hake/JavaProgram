public class Q103_PrintFirstHalfOfArray_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        int half = a.length / 2;

        for (int i = 0; i < half; i++) {
            System.out.print(a[i]);
            if (i != half - 1)
                System.out.print(" ");
        }
    }
}
