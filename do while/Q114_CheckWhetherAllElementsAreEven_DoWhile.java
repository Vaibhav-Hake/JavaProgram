public class Q114_CheckWhetherAllElementsAreEven_DoWhile {
    public static void main(String[] args) {
        int[] a = { 12, 24, 36, 48, 60 };

        boolean allEven = true;
        int i = 0;
        do {
            if (a[i] % 2 != 0) {
                allEven = false;
                break;
            }
            i++;
        } while (i < a.length);

        if (allEven)
            System.out.print("All elements are even.");
        else
            System.out.print("All elements are not even.");
    }
}
