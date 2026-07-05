public class Q044_PrintOddIndexCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
        }
    }
}
