public class Q049_PrintSpecialCharacterIndexes_While {
    static boolean isSpecial(char c) {
        boolean isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        boolean isDigit = c >= '0' && c <= '9';
        return !isAlpha && !isDigit;
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            if (isSpecial(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}
