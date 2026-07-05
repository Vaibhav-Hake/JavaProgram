public class BuzzNumbers_DoWhile {
    public static void main(String[] args) {
        int[] a = { 14, 27, 35, 42, 50, 67, 89 };

        int i = 0;
        boolean first = true;
        do {
            int x = a[i];
            boolean buzz = (x % 7 == 0) || (Math.abs(x) % 10 == 7);
            if (buzz) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        } while (i < a.length);
    }
}
