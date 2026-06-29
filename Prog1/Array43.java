

public class Array43 {
    public static void main() {


        char[] ch = {'a', 'e', 'i', 't'};
        for (int i = 0; i < ch.length; i++)
        {

            //char [] ch = {'a', 'e', 'i', 't'};
            boolean flag = true;

                switch (ch[i])
                {
                    case 'a','e','i','o','u','A','E','I','O','U' ->
                        flag = true;
                }

                if (flag)
                    System.out.println(i);


        }

    }
}
