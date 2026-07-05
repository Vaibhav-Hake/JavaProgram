public class Q064_PrintFirstLowercaseFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { '@', 'A', '7', 'n', 'B' };

        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                System.out.print(c);
                return;
            }
        }
    }
}
