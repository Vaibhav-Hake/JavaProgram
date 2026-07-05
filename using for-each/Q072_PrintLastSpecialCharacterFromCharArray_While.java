public class Q072_PrintLastSpecialCharacterFromCharArray_While {
    static boolean isSpecial(char c) {
        boolean isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        boolean isDigit = c >= '0' && c <= '9';
        return !isAlpha && !isDigit;
    }

    public static void main(String[] args) {
        char[] ch = { '@', 'A', '#', '7', '$', 'm' };

        char last = 0;
        for (int i = 0; i < ch.length; i++) {
            if (isSpecial(ch[i])) {
                last = ch[i];
            }
        }

        System.out.print(last);
    }
}
