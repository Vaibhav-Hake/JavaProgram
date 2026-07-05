public class Q056_SumOfOddASCIIValueCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'C', 'd', 'E' };
        int sum = 0;

        for (char c : ch) {
            int v = (int) c;
            if (v % 2 != 0) {
                sum += v;
            }
        }

        System.out.print(sum);
    }
}
