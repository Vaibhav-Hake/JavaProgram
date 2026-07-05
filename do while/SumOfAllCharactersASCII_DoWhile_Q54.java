public class SumOfAllCharactersASCII_DoWhile_Q54 {
    public static void main(String[] args) {
        char[] ch = { 'J', 'a', 'v', 'a' };

        int sum = 0;
        int i = 0;
        do {
            sum += (int) ch[i];
            i++;
        } while (i < ch.length);

        System.out.print(sum);
    }
}
