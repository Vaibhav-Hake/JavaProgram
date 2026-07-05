public class Q046_PrintConsonantCharacterIndexes_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (isLetter(c) && !isVowel(c)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}
