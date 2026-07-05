import java.util.Scanner;

public class Q034_CharArrayFromUserAndPrint_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] ch = new char[n];
        System.out.print("Enter characters: ");
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ch[i] = s.charAt(0);
        }

        for (char c : ch) {
            System.out.print(c + " ");
        }
    }
}
