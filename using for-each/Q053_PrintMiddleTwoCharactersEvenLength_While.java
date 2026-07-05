public class Q053_PrintMiddleTwoCharactersEvenLength_While {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };

        int n = ch.length;
        int i1 = n / 2 - 1;
        int i2 = n / 2;

        System.out.print(ch[i1] + " " + ch[i2]);
    }
}
