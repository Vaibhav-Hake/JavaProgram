public class Q69_LastDigitCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', '4', '#', '8', 'm', '2' };

        char last = 0;
        int i = 0;
        do {
            char c = ch[i];
            if (Character.isDigit(c)) {
                last = c;
            }
            i++;
        } while (i < ch.length);

        if (last != 0)
            System.out.print(last);
    }
}
