public class BuzzNumbers_While {
    public static void main(String[] args) {
        int[] a = { 14, 27, 35, 42, 50, 67, 89 };

        int i = 0;
        boolean first = true;
        while (i < a.length) {
            int x = a[i];
            boolean buzz = (x % 7 == 0) || (Math.abs(x) % 10 == 7);
            if (buzz) {
                if (!first)
                    System.out.print(" ");
                System.out.print(x);
                first = false;
            }
            i++;
        }
    }
}
