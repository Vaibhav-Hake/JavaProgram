import java.util.Scanner;

public class CharArrayFromUserAndPrint_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        char[] ch = new char[n];
        System.out.println("Enter characters:");

        int i = 0;
        while (i < n) {
            String s = sc.next();
            ch[i] = s.charAt(0);
            i++;
        }

        i = 0;
        while (i < n) {
            System.out.print(ch[i] + (i == n - 1 ? "" : " "));
            i++;
        }

        sc.close();
    }
}
