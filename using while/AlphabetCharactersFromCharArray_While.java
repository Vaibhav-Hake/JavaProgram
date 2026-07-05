public class AlphabetCharactersFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7' };

        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            if (Character.isLetter(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        }
    }
}
