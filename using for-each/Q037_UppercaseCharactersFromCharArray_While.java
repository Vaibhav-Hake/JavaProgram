public class Q037_UppercaseCharactersFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        boolean first = true;
        for (char c : ch) {
            if (c >= 'A' && c <= 'Z') {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
