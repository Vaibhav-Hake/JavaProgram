public class PrintOddIndexCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            if (i % 2 != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        }
    }
}
