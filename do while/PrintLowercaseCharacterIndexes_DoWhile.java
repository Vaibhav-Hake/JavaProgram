public class PrintLowercaseCharacterIndexes_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        do {
            if (Character.isLowerCase(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
