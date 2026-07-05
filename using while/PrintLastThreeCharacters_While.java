public class PrintLastThreeCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int n = ch.length;
        int i = Math.max(0, n - 3);
        boolean first = true;
        while (i < n) {
            if (!first)
                System.out.print(" ");
            System.out.print(ch[i]);
            first = false;
            i++;
        }
    }
}
