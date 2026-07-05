public class Q071_PrintLastLowercaseFromCharArray_While {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', 'M', 'n', 'P', 'z' };

        char last = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                last = ch[i];
            }
        }

        System.out.print(last);
    }
}
