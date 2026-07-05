public class Q038_LowercaseCharactersFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        boolean first = true;
        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
