public class Q051_PrintFirstThreeCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        for (int i = 0; i < 3 && i < ch.length; i++) {
            System.out.print(ch[i]);
            if (i != 2)
                System.out.print(" ");
        }
    }
}
