public class MiddleElementOfArray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int middleIndex = a.length / 2; // 0-based
        int middleElement = a[middleIndex];

        System.out.print(middleElement);
    }
}
