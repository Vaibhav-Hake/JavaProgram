

public class Array60 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;
        int sum = 1;
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> flag = false;
                default -> flag = true;
            }

            if (flag)
            {
                System.out.println(ch[i]);
            }

        }

        System.out.println(sum);

    }
}
