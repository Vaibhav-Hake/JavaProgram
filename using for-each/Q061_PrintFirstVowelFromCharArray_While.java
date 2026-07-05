public class Q061_PrintFirstVowelFromCharArray_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    public static void main(String[] args) {
        char[] ch = { '#', 'T', 'm', 'E', '7', 'a' };

        for (char c : ch) {
            if (isVowel(c)) {
                System.out.print(c);
                return;
            }
        }
    }
}
