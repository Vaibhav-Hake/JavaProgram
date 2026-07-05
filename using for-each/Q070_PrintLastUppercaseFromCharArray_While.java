public class Q070_PrintLastUppercaseFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'M', '7', 'P', 'e' };

        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                System.out.print(ch[i]);
                return;
            }
        }
    }
}
