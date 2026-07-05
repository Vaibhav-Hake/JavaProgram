public class Q106_CountOccurrencesOfGivenElement_DoWhile {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 20, 40, 20, 50, 20 };
        int target = 20;

        int count = 0;
        int i = 0;
        do {
            if (a[i] == target)
                count++;
            i++;
        } while (i < a.length);

        System.out.print(target + " occurs " + count + " times");
    }
}
