public class Q062_PrintFirstConsonantFromCharArray_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        char[] ch = { '@', '3', 'A', 'k', 'e', 'M' };

        for (char c : ch) {
            if (isLetter(c) && !isVowel(c)) {
                System.out.print(c);
                return;
            }
        }
    }
}
