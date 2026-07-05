public class SumOfEvenASCIICharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'B', 'c', 'D', 'e' };

        int sum = 0;
        int i = 0;
        while (i < ch.length) {
            int ascii = (int) ch[i];
            if (ascii % 2 == 0) {
                sum += ascii;
            }
            i++;
        }

        System.out.print(sum);
    }
}
