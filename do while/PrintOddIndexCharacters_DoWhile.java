public class PrintOddIndexCharacters_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        do {
            if (i % 2 != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
