public class PrintLowercaseCharacterIndexes_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            if (Character.isLowerCase(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
            i++;
        }
    }
}
