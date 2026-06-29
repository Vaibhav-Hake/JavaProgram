

public class Array69 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;

        for (int i = ch.length-1; i > 0; i--) {
            switch(ch[i])
            {
                case 'a','e','i','o','u','A','E','I','O','U' -> flag = true;
            }

            if (flag) {
                System.out.println(ch[i]);
                break;
            }
        }



    }
}
