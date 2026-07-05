public class ProductOfEvenASCIIValueCharacters_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'C', 'E' };

        long product = 1;
        boolean found = false;
        int i = 0;
        while (i < ch.length) {
            int ascii = (int) ch[i];
            if (ascii % 2 == 0) {
                product *= ascii;
                found = true;
            }
            i++;
        }

        if (!found)
            product = 0;
        System.out.print(product);
    }
}
