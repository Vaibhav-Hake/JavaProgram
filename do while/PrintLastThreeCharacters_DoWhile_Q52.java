public class PrintLastThreeCharacters_DoWhile_Q52 {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int n = ch.length;
        int i = n - 3;
        if (i < 0)
            i = 0;

        boolean first = true;
        do {
            if (!first)
                System.out.print(" ");
            System.out.print(ch[i]);
            first = false;
            i++;
        } while (i < n);
    }
}
