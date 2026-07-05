public class VowelsFromCharArray {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7' };

        String vowels = "AEIOUaeiou";
        boolean first = true;
        for (char c : ch) {
            if (vowels.indexOf(c) >= 0) {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
