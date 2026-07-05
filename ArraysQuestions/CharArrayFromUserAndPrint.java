import java.util.Scanner;

public class CharArrayFromUserAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        char[] ch = new char[n];
        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ch[i] = s.charAt(0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ch[i] + (i == n - 1 ? "" : " "));
        }

        sc.close();
    }
}
