public class Q106_CountOccurrencesOfGivenElement_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 20, 40, 20, 50, 20 };
        int target = 20;

        int count = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] == target)
                count++;
            i++;
        }

        System.out.print(target + " occurs " + count + " times");
    }
}
