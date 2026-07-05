import java.util.Scanner;

public class CharArrayFromUserAndPrint_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        char[] ch = new char[n];
        System.out.println("Enter characters:");

        int i = 0;
        do {
            String s = sc.next();
            ch[i] = s.charAt(0);
            i++;
        } while (i < n);

        i = 0;
        do {
            System.out.print(ch[i] + (i == n - 1 ? "" : " "));
            i++;
        } while (i < n);

        sc.close();
    }
}
