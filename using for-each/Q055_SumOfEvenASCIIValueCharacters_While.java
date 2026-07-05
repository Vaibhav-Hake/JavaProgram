public class Q055_SumOfEvenASCIIValueCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'B', 'c', 'D', 'e' };
        int sum = 0;

        for (char c : ch) {
            int v = (int) c;
            if (v % 2 == 0) {
                sum += v;
            }
        }

        System.out.print(sum);
    }
}
