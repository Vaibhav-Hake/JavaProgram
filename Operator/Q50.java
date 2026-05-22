import java.util.Scanner;

class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cost = sc.nextDouble();
        double loss = sc.nextDouble();

        double sell = cost - (cost * loss / 100);

        System.out.println( sell);
    }
}