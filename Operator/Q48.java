import java.util.Scanner;

class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double speed = sc.nextDouble();

        double time = distance / speed;

        System.out.println( time );
    }
}