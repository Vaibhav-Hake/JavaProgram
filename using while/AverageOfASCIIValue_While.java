public class AverageOfASCIIValue_While {
    public static void main(String[] args) {
        char[] ch = { 'M', 'N', 'O' };

        int sum = 0;
        int i = 0;
        while (i < ch.length) {
            sum += (int) ch[i];
            i++;
        }

        double avg = (double) sum / ch.length;
        System.out.print(avg);
    }
}
