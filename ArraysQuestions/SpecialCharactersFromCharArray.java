public class SpecialCharactersFromCharArray {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7' };

        boolean first = true;
        for (char c : ch) {
            boolean isAlphabet = Character.isLetter(c);
            boolean isDigit = Character.isDigit(c);
            if (!isAlphabet && !isDigit) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
