public class PrintFirstThreeCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        int i = 0;
        boolean first = true;
        while (i < 3 && i < ch.length) {
            if (!first)
                System.out.print(" ");
            System.out.print(ch[i]);
            first = false;
            i++;
        }
    }
}
