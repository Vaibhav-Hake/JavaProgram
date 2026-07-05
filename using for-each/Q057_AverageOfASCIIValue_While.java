public class Q057_AverageOfASCIIValue_While {
    public static void main(String[] args) {
        char[] ch = { 'M', 'N', 'O' };

        int sum = 0;
        for (char c : ch) {
            sum += (int) c;
        }

        double avg = (double) sum / ch.length;
        System.out.print(avg);
    }
}
