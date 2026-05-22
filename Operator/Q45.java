import java.util.Scanner;

class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();
        double per = sc.nextDouble();
        double addedJ = sc.nextDouble();

        double juice = (per / 100) * total;

        double newJ = juice + addedJ;
        double newTotal = total + addedJ;

        double newPercentage = (newJ / newTotal) * 100;

        System.out.println(newPercentage);
    }
}