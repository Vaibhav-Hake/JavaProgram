public class Q70_LastUppercaseCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'M', '7', 'P', 'e' };

        char last = 0;
        int i = 0;
        do {
            char c = ch[i];
            if (Character.isUpperCase(c)) {
                last = c;
            }
            i++;
        } while (i < ch.length);

        if (last != 0)
            System.out.print(last);
    }
}
