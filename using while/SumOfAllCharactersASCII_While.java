public class SumOfAllCharactersASCII_While {
    public static void main(String[] args) {
        char[] ch = { 'J', 'a', 'v', 'a' };

        int sum = 0;
        int i = 0;
        while (i < ch.length) {
            sum += (int) ch[i];
            i++;
        }

        System.out.print(sum);
    }
}
