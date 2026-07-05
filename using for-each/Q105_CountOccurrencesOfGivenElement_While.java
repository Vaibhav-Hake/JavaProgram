public class Q105_CountOccurrencesOfGivenElement_While {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 20, 40, 20, 50, 20 };
        int element = 20;

        int count = 0;
        for (int x : a) {
            if (x == element)
                count++;
        }

        System.out.print(element + " occurs " + count + " times.");
    }
}
