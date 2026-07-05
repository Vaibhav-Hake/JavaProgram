public class Q112_CheckWhetherAllElementsAreEven_While {
    public static void main(String[] args) {
        int[] a = { 12, 24, 36, 48, 60 };

        for (int x : a) {
            if (x % 2 != 0) {
                System.out.print("All elements are not even.");
                return;
            }
        }

        System.out.print("All elements are even.");
    }
}
