public class Q115_CheckWhetherAllElementsAreOdd_While {
    public static void main(String[] args) {
        int[] a = { 3, 5, 7, 9, 11 };

        boolean allOdd = true;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                allOdd = false;
                break;
            }
            i++;
        }

        System.out.print(allOdd ? "All elements are odd." : "All elements are not odd.");
    }
}
