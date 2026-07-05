public class Q063_PrintFirstUppercaseFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { '#', '7', 'm', 'P', 'a' };

        for (char c : ch) {
            if (c >= 'A' && c <= 'Z') {
                System.out.print(c);
                return;
            }
        }
    }
}
