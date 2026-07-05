public class Q050_PrintAlphabetCharacterIndexes_While {
    static boolean isAlpha(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            if (isAlpha(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}
