public class Q054_SumOfAllCharacterASCII_While {
    public static void main(String[] args) {
        char[] ch = { 'J', 'a', 'v', 'a' };
        int sum = 0;

        for (char c : ch) {
            sum += (int) c;
        }

        System.out.print(sum);
    }
}
