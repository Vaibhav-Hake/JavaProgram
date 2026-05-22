import java.util.Scanner;

class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inc = sc.nextDouble();
        double exp = sc.nextDouble();

        double monthS = inc - exp;
        double yearS = monthS * 12;

        System.out.println( monthS);
        System.out.println( yearS);
    }
}