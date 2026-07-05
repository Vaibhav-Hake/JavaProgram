public class PrintMiddleTwoCharactersEvenLength_While {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' }; // even length example

        int n = ch.length;
        int mid1 = n / 2 - 1;
        int mid2 = n / 2;

        System.out.print(ch[mid1] + " " + ch[mid2]);
    }
}
