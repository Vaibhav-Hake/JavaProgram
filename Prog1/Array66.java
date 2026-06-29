

public class Array66 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;

        for (int i = ch.length-1; i > 0; i--) {
            if ( ch[i] >= 65 && ch[i] <= 90)

            {
                System.out.println(ch[i]);
                break;
            }
        }



    }
}
