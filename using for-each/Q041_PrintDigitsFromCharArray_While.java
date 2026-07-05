public class Q041_PrintDigitsFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', '7', '@', 'b', '#', '9', '$', '3', 'M' };

        boolean first = true;
        for (char c : ch) {
            if (c >= '0' && c <= '9') {
                if (!first)
                    System.out.print(" ");
                System.out.print(c);
                first = false;
            }
        }
    }
}
