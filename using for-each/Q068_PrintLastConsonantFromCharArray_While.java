public class Q068_PrintLastConsonantFromCharArray_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'k', 'e', 'M', 'o', 't' };

        for (int i = ch.length - 1; i >= 0; i--) {
            char c = ch[i];
            if (isLetter(c) && !isVowel(c)) {
                System.out.print(c);
                return;
            }
        }
    }
}
