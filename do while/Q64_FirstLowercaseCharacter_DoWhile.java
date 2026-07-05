public class Q64_FirstLowercaseCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { '@', 'A', '7', 'n', 'B' };

        int i = 0;
        do {
            char c = ch[i];
            if (Character.isLowerCase(c)) {
                System.out.print(c);
                break;
            }
            i++;
        } while (i < ch.length);
    }
}
