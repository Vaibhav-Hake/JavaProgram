public class Q043_PrintEvenIndexCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                System.out.print(ch[i]);
                if (i != ch.length - 1) {
                    // spacing not controlled by sample; keep simple
                }
                if (i != 0 && i + 2 < ch.length) {
                    System.out.print(" ");
                }
            }
        }
    }
}
