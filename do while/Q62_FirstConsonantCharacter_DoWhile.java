public class Q62_FirstConsonantCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { '@', '3', 'A', 'k', 'e', 'M' };

        String vowels = "AEIOUaeiou";
        int i = 0;
        do {
            char c = ch[i];
            if (!vowels.contains(String.valueOf(c)) && Character.isLetter(c)) {
                System.out.print(c);
                break;
            }
            i++;
        } while (i < ch.length);
    }
}
