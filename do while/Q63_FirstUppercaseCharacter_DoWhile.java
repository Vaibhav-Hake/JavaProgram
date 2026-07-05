public class Q63_FirstUppercaseCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { '#', '7', 'm', 'P', 'a' };

        int i = 0;
        do {
            char c = ch[i];
            if (Character.isUpperCase(c)) {
                System.out.print(c);
                break;
            }
            i++;
        } while (i < ch.length);
    }
}
