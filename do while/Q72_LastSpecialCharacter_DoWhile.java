public class Q72_LastSpecialCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { '@', 'A', '#', '7', '$', 'm' };

        char last = 0;
        int i = 0;
        do {
            char c = ch[i];
            boolean isAlphabet = Character.isLetter(c);
            boolean isDigit = Character.isDigit(c);
            if (!isAlphabet && !isDigit) {
                last = c;
            }
            i++;
        } while (i < ch.length);

        if (last != 0)
            System.out.print(last);
    }
}
