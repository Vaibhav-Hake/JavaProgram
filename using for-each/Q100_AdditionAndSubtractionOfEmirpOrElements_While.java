public class Q100_AdditionAndSubtractionOfEmirpOrElements_While {
    // Task 100 in the list: "WAP to print addition and subtraction of an array
    // elements"
    // Using example array.
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };

        int sum = 0;
        int first = a[0];
        for (int x : a) {
            sum += x;
        }

        int sub = first;
        for (int i = 1; i < a.length; i++) {
            sub -= a[i];
        }

        System.out.print(sum + " " + sub);
    }
}
