public class Q66_FirstDigitCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', '#', 'm', '5', '9' };

        int i = 0;
        do {
            char c = ch[i];
            if (Character.isDigit(c)) {
                System.out.print(c);
                break;
            }
            i++;
        } while (i < ch.length);
    }
}
