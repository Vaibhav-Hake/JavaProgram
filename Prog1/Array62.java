

public class Array62 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;
        int sum = 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90)

            {
                System.out.println(ch[i]);
                break;
            }
        }

        System.out.println(sum);

    }
}
