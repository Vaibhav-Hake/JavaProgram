public class PrintSpecialCharacterIndexes_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        do {
            char c = ch[i];
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
