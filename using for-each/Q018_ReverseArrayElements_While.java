public class Q018_ReverseArrayElements_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
