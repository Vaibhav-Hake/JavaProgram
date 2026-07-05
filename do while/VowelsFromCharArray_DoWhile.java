public class VowelsFromCharArray_DoWhile {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        String vowels = "AEIOUaeiou";

        int i = 0;
        boolean first = true;
        do {
            if (vowels.indexOf(ch[i]) >= 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(ch[i]);
                first = false;
            }
            i++;
        } while (i < ch.length);
    }
}
