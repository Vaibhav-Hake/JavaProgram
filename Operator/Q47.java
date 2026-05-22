import java.util.Scanner;

class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();

        double sum = r1 + r2 + r3;

        double share1 = (r1 / sum) * total;
        double share2 = (r2 / sum) * total;
        double share3 = (r3 / sum) * total;

        System.out.println(share1);
        System.out.println( share2);
        System.out.println( share3);
    }
}