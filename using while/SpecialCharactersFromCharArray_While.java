public class SpecialCharactersFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7' };

        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            char c = ch[i];
            boolean isAlphabet = Character.isLetter(c);
            boolean isDigit = Character.isDigit(c);

            if (!isAlphabet && !isDigit) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
            i++;
        }
    }
}
