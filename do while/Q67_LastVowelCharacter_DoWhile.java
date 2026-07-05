public class Q67_LastVowelCharacter_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'k', 'e', 'M', 'o', '#' };
        String vowels = "AEIOUaeiou";

        char last = 0;
        int i = 0;
        do {
            char c = ch[i];
            if (vowels.indexOf(c) >= 0) {
                last = c;
            }
            i++;
        } while (i < ch.length);

        if (last != 0)
            System.out.print(last);
    }
}
