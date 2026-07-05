public class Q048_PrintLowercaseCharacterIndexes_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c >= 'a' && c <= 'z') {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}
