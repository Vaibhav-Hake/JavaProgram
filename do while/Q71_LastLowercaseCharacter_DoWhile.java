public class Q71_LastLowercaseCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'M', 'n', 'P', 'z' };

        char last = 0;
        int i = 0;
        do {
            char c = ch[i];
            if (Character.isLowerCase(c)) {
                last = c;
            }
            i++;
        } while (i < ch.length);

        if (last != 0)
            System.out.print(last);
    }
}
