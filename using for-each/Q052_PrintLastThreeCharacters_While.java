public class Q052_PrintLastThreeCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        for (int i = Math.max(0, ch.length - 3); i < ch.length; i++) {
            System.out.print(ch[i]);
            if (i != ch.length - 1)
                System.out.print(" ");
        }
    }
}
