public class Q039_SpecialCharactersFromCharArray_While {
    static boolean isSpecial(char c) {
        boolean isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        boolean isDigit = c >= '0' && c <= '9';
        return !isAlpha && !isDigit;
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7' };

        boolean first = true;
        for (char c : ch) {
            if (isSpecial(c)) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
