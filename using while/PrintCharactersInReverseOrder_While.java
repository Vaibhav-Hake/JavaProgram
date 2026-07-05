public class PrintCharactersInReverseOrder_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = ch.length - 1;
        boolean first = true;
        while (i >= 0) {
            if (!first)
                System.out.print(" ");
            System.out.print(ch[i]);
            first = false;
            i--;
        }
    }
}
