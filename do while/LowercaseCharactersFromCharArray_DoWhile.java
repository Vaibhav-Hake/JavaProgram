public class LowercaseCharactersFromCharArray_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        int i = 0;
        boolean first = true;
        do {
            if (Character.isLowerCase(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
