public class ProductOfASCIIValueCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'B', 'C' };

        long product = 1;
        int i = 0;
        while (i < ch.length) {
            product *= (int) ch[i];
            i++;
        }

        System.out.print(product);
    }
}
