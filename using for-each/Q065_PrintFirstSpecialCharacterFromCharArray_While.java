public class Q065_PrintFirstSpecialCharacterFromCharArray_While {
    static boolean isSpecial(char c) {
        boolean isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        boolean isDigit = c >= '0' && c <= '9';
        return !isAlpha && !isDigit;
    }

    public static void main(String[] args) {
        char[] ch = { 'A', '7', '$', 'm', '#' };

        for (char c : ch) {
            if (isSpecial(c)) {
                System.out.print(c);
                return;
            }
        }
    }
}
