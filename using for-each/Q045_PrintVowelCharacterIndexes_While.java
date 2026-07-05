public class Q045_PrintVowelCharacterIndexes_While {
    static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
    }

    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        boolean first = true;
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}
