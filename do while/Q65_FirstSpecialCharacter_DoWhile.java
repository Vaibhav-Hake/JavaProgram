public class Q65_FirstSpecialCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', '7', '$', 'm', '#' };

        int i = 0;
        do {
            char c = ch[i];
            boolean isAlphabet = Character.isLetter(c);
            boolean isDigit = Character.isDigit(c);
            if (!isAlphabet && !isDigit) {
                System.out.print(c);
                break;
            }
            i++;
        } while (i < ch.length);
    }
}
