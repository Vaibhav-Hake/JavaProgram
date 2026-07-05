public class PrintOnlyAlphabetCharacters_DoWhile_Q57 {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        do {
            if (Character.isLetter(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
