public class Q066_PrintFirstDigitFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', '#', 'm', '5', '9' };

        for (char c : ch) {
            if (c >= '0' && c <= '9') {
                System.out.print(c);
                return;
            }
        }
    }
}
