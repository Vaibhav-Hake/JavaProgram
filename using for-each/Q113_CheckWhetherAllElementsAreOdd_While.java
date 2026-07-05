public class Q113_CheckWhetherAllElementsAreOdd_While {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };

        for (int x : a) {
            if (x % 2 == 0) {
                System.out.print("All elements are not odd.");
                return;
            }
        }

        System.out.print("All elements are odd.");
    }
}
