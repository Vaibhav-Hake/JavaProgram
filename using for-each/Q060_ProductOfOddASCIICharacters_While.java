public class Q060_ProductOfOddASCIICharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'C', 'E' };
        long product = 1;
        boolean found = false;

        for (char c : ch) {
            int v = (int) c;
            if (v % 2 != 0) {
                product *= v;
                found = true;
            }
        }

        System.out.print(found ? product : 0);
    }
}
