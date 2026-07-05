public class Q058_ProductOfASCIIValueCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'B', 'C' };
        long product = 1;

        for (char c : ch) {
            product *= (int) c;
        }

        System.out.print(product);
    }
}
