public class Q040_AlphabetCharactersFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7' };

        boolean first = true;
        for (char c : ch) {
            boolean isAlpha = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
            if (isAlpha) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
