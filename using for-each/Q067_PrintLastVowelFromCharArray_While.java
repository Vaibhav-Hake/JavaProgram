public class Q067_PrintLastVowelFromCharArray_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'k', 'e', 'M', 'o', '#' };

        for (int i = ch.length - 1; i >= 0; i--) {
            if (isVowel(ch[i])) {
                System.out.print(ch[i]);
                return;
            }
        }
    }
}
