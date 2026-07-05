public class PrintVowelCharacterIndexes_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };

        String vowels = "AEIOUaeiou";
        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            if (vowels.indexOf(ch[i]) >= 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(i);
                first = false;
            }
            i++;
        }
    }
}
