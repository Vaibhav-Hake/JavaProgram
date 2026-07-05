public class PrintFirstThreeCharacters_DoWhile_Q51 {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        do {
            if (i < 3) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < 3 && i < ch.length);
    }
}
