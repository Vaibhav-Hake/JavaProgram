public class PrintCharactersInReverseOrder_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = ch.length - 1;
        boolean first = true;
        do {
            if (!first)
                System.out.print(" ");
            System.out.print(ch[i]);
            first = false;
            i--;
        } while (i >= 0);
    }
}
