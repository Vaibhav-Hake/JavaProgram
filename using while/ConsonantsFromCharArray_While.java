public class ConsonantsFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        String vowels = "AEIOUaeiou";
        int i = 0;
        boolean first = true;
        while (i < ch.length) {
            char c = ch[i];
            if (Character.isLetter(c) && vowels.indexOf(c) < 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
            i++;
        }
    }
}
