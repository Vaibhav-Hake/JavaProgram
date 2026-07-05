public class ReverseArray_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int i = a.length - 1;
        boolean firstPrinted = false;
        while (i >= 0) {
            if (firstPrinted)
                System.out.print(" ");
            System.out.print(a[i]);
            firstPrinted = true;
            i--;
        }
    }
}
