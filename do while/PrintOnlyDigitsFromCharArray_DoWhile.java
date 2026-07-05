public class PrintOnlyDigitsFromCharArray_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', '7', '@', 'b', '#', '9', '$', '3', 'M' };

        int i = 0;
        boolean first = true;
        do {
            if (Character.isDigit(ch[i])) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
